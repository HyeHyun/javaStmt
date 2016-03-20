package algoMath;

import java.util.Scanner;

/**
 * @file : BinaryToDecimal.java
 * @author KIM HYEHYEON
 * @date 2016. 3. 19.
 * @story 15.소수점이 포함된 2진수를 10진수로 변환하기
 */
public class BinaryToDecimal {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("이진수 10자리를 입력하세요 ");
		String binary = scanner.next();
		double decimal = 0.0;
		int i = 0;

		while (i < 10) {
			i = i + 1;
			decimal += (Integer.parseInt(binary.substring(i - 1, i)) * Math.pow(2, 5 - i));
		}
	}
}
