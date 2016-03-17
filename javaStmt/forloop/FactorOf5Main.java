package forloop;

import java.util.Scanner;

/**
 * @file : FactorOf5.java
 * @author KIM HYEHYEON
 * @date 2016. 3. 11.
 * @story 5의 배수의 갯수와 합
 */
public class FactorOf5Main {
	/**
	 * [결과]
	 * 1에서 100까지 정수까지
	 * 5 배수의 갯수는 20이고
	 * 5 배수의 합은 1050 이다.
	 * */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("리미트값을 입력하세요 ");
		FactorOf5 f = new FactorOf5();
		f.setValue(scanner.nextInt());
		
		System.out.println(f.toString());
	}
}
