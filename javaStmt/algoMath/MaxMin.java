package algoMath;

import java.util.Scanner;

/**
 * @file : MaxMin.java
 * @author KIM HYEHYEON
 * @date 2016. 3. 19.
 * @story 16.최대값, 최소값 구하기
 * 10개의 수치 자료를 입력 받아 배열에 저장한 후 저장된 자료 중 가장 큰 값을 출력
 */
public class MaxMin {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] A = new int[10];
		int i = 0, max = 0;
		
		System.out.print("10개의 수를 입력하세요 ");
		while (i < A.length) {
			A[i] = scanner.nextInt();
			i = i + 1;
		}
		
		for (i = 0; i < A.length; i++) {
			if (A[i] > max) {
				max = A[i];
			}
		}
		
		System.out.println("최대값 : " + max);
	}
}
