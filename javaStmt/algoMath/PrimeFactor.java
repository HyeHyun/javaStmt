package algoMath;

import java.util.Scanner;

/**
 * @file : PrimeFactor.java
 * @author KIM HYEHYEON
 * @date 2016. 3. 19.
 * @story 12.소인수 분해하기
 * 정수를 입력 받아 소인수를 구해 출력
 */
public class PrimeFactor {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] A = new int[10];
		System.out.print("소인수분해 할 숫자를 입력하세요 ");
		int B = scanner.nextInt(), C = 0, D = 2, E = (int) Math.sqrt(B), mok, nmg;
		// C : 배열의 인덱스, D : 소인수인지 판별할 값, E : 소인수분해 할 값의 제곱근
		
		while (D <= E) {
			mok = B / D;
			nmg = B - mok * D;
			
			if (nmg == 0) {
				A[C] = D;
				B = mok;
				C = C + 1;
				D = 2;
				E = (int) Math.sqrt(B);
			} else {
				D = D + 1;
			}
		}
		
		D = B;
		A[C] = D;
		
		for (C = 0; A[C] != 0; C++) {
			System.out.print(A[C] + "\t");
		}
	}
}
