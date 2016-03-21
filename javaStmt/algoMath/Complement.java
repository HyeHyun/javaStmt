package algoMath;

import java.util.Scanner;

/**
 * @file : Complement.java
 * @author KIM HYEHYEON
 * @date 2016. 3. 19.
 * @story 19.보수 구하기
 * 0 또는 1로 입력되는 다섯 개의 숫자를 배열에 입력받아 1의 보수와 2의 보수를 출력
 */
public class Complement {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] A = new int[5], B1 = new int[5], B2 = new int[5]; // A : 입력받는 값, B1 : 1의 보수, B2 : 2의 보수
		int i = 0, C = 1; // C : 자리올림수
		
		System.out.print("2진수 5자리를 입력하세요 ");
		while (i < A.length) {
			A[i] = scanner.nextInt();
			B1[i] = 1 - A[i]; // 1의 보수 : 값이 1이면 0으로, 값이 0이면 1로 바꾸어준다.
			i = i + 1;
		}

		while (i > 0) { // 2의 보수 : 1의 보수 + 1
			i = i - 1;
			B2[i] = B1[i] + C; 
			B2[i] = Math.floorMod(B2[i], 2); // 2진수 이므로 값이 2보다 작은값이어야 한다.
			C = B1[i] * C; // 자리올림이 발생했는지 확인
		}
		
		System.out.println("이진수  : " + A[0] + A[1] + A[2] + A[3] + A[4]);
		System.out.println("1의 보수 : " + B1[0] + B1[1] + B1[2] + B1[3] + B1[4]);
		System.out.println("2의 보수 : " + B2[0] + B2[1] + B2[2] + B2[3] + B2[4]);
	}
}
