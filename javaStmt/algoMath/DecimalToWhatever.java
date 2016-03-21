package algoMath;

import java.util.Scanner;

/**
 * @file : DecimalToWhatever.java
 * @author KIM HYEHYEON
 * @date 2016. 3. 19.
 * @story 14.10진수를 임의의 진수로 변환하기
 * 10진수를 입력 받아 2진수, 8진수, 16진수로 변환해서 출력
 * 단, 진수 표시에 사용될 0~9, A, B, C, D, E, F는 A(16) 배열에 저장되어 있다고 가정
 */
public class DecimalToWhatever {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] A = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F"};
		System.out.print("변환할 진수와 10진수값을 입력하세요 ");
		int B = scanner.nextInt(), C = scanner.nextInt(), D = 1, E, F;
		// D : 10진수값에 가장 가까운 B의 거듭제곱값, E : 몫, F : 나머지
		
		while (D <= C) {
			D = D * B;
		}

		while (D != 1) {
			D = D / B;
			E = C / D;
			F = C - E * D;
			System.out.print(A[E]);
			C = F;
		}
	}
}
