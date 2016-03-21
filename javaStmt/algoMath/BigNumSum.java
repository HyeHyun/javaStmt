package algoMath;

import java.util.Scanner;

/**
 * @file : BigNumSum.java
 * @author KIM HYEHYEON
 * @date 2016. 3. 19.
 * @story 21.큰 수 더하기
 * 100건 이내의 12자리로 구성된 숫자를 더하라.
 * 단, 12자리의 숫자는 각 자리가 분리되어 배열에 입력된다.
 * 단, 배열의 첫 번째 요소로 0을 입력 받으면 계산 후 결과를 출력하고 프로그램을 종료한다.
 * 단, 결과값이 들어갈 배열에는 초기 값으로 0이 들어 있다고 가정
 */
public class BigNumSum {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] A = new int[5], B = new int[6];
		int i, j, mok, nmg;
		
		System.out.print("숫자를 입력하세요 ");
		for (i = 0; i < A.length; i++) {
			A[i] = scanner.nextInt();
		}
		
		while (A[0] != 0) {
			System.out.println("A[0] : " + A[0]);
			for (j = 0; j < A.length-2; j++) {
				B[j+2] = B[j+2] + A[j];
			}
			for (i = 0; i < A.length; i++) {
				A[i] = scanner.nextInt();
			}
			
		}
/*
		for (i = B.length; i >= 1; i--) {
			mok = B[i] / 10;
			nmg = B[i] - mok * 10;
			B[i] = nmg;
			B[i-1] = B[i-1] + mok;
		}
		*/
		for (i = 0; i < B.length; i++) {
			System.out.print(B[i]+"\t");
		}
	}
}
