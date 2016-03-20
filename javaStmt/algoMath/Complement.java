package algoMath;

import java.util.Scanner;

/**
 * @file : Complement.java
 * @author KIM HYEHYEON
 * @date 2016. 3. 19.
 * @story 19.보수 구하기
 */
public class Complement {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] arr = new int[5], arr1 = new int[5], arr2 = new int[5]; // arr : 입력받는 값, arr1 : 1의 보수, arr2 : 2의 보수
		int i = 0, j = 1; // j : 자리올림수
		
		System.out.print("2진수 5자리를 입력하세요 ");
		while (i < arr.length) {
			arr[i] = scanner.nextInt();
			arr1[i] = 1-arr[i]; // 1의 보수 : 값이 1이면 0으로, 값이 0이면 1로 바꾸어준다.
			i++;
		}

		while (i > 0) { // 2의 보수 : 1의 보수 + 1
			i = i-1;
			arr2[i] = arr1[i] + j; 
			arr2[i] = arr2[i] % 2; // 2진수 이므로 값이 2보다 작은값이어야 한다.
			j = arr1[i] * j; // 자리올림이 발생했는지 확인
		}
		
		System.out.println("이진수  : " + arr[0] + arr[1] + arr[2] + arr[3] + arr[4]);
		System.out.println("1의 보수 : " + arr1[0] + arr1[1] + arr1[2] + arr1[3] + arr1[4]);
		System.out.println("2의 보수 : " + arr2[0] + arr2[1] + arr2[2] + arr2[3] + arr2[4]);
	}
}
