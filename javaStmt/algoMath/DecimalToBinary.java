package algoMath;

import java.util.Scanner;

/**
 * @file : DecimalToBinary.java
 * @author KIM HYEHYEON
 * @date 2016. 3. 19.
 * @story 13.10진수를 2진수로 변환
 */
public class DecimalToBinary {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("십진를 입력하세요 ");
		int decimal = scanner.nextInt(), i = 0;
		int[] arr = new int[10];

		while (decimal > 0) {
			arr[i] = decimal % 2;
			decimal /= 2;
			i++;
		}

		for (i = i - 1; i >= 0; i--) {
			System.out.print(arr[i]);
		}
	}
}
