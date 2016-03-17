package ifelse;

import java.util.Scanner;

/**
 * @file : BigNumber.java
 * @author KIM HYEHYEON
 * @date 2016. 3. 11.
 * @story 입력된 3개 숫자에서 가장 큰 수
 */
public class BigNumberMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("3개의 숫자를 입력하세요 ");
		BigNumber big = new BigNumber();
		big.setBig(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
		
		System.out.println(big.toString());
	}
}