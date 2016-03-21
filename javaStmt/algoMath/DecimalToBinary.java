package algoMath;

import java.util.Scanner;

/**
 * @file : DecimalToBinary.java
 * @author KIM HYEHYEON
 * @date 2016. 3. 19.
 * @story 13.10진수를 2진수로 변환
 * 10진수를 입력 받아 2진수로 변환(단, 1000이하의 숫자를 입력받는다.)
 */
public class DecimalToBinary {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] A = new int[10];
		System.out.print("십진수를 입력하세요 ");
		int B = scanner.nextInt(), C = 0, mok = B / 2, nmg;		

		while (mok != 0) {
			mok = B / 2;
			nmg = B - mok * 2;
			A[C] = nmg;
			C = C + 1;
			B = mok;
			System.out.println(nmg);
		}

		for (C = C - 1; C >= 0; C--) {
			System.out.print(A[C]);
		}
	}
}
