package algoMath;

import java.util.Scanner;

/**
 * @file : Near7.java
 * @author KIM HYEHYEON
 * @date 2016. 3. 19.
 * @story 18.7에 가장 가까운 수 구하기
 * 10개의 1자리 양의 정수를 입력 받아 배열에 저장한 후 저장된 자료 중 7에 가장 가까운 값을 찾아 출력
 * 자료는 1자리 정수이고 근사값이 2개인 경우에는 나중에 찾은 값을 출력
 */
public class Near7 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int i = 0, J = 9, L = 0, M = 0; // J : 차이값 중 최소값, L : 7과 비교대상의 차이값, m : 7과 가장 가까운 값
		int[] A = new int[10];
		
		System.out.print("한자리수 10개를 입력하세요 ");
		while (i < A.length) {
			A[i] = scanner.nextInt();
			i = i + 1;
		}
		
		for (i = 0;  i < A.length; i++) {
			if (A[i] > 7) {
				L = A[i] - 7;
			} else {
				L = 7 - A[i];
			}
			
			if (J >= L) {
				J = L;
				M = A[i];
			}
		}
		
		System.out.println("7과 가장 가까운 값 : " + M);
	}
}
