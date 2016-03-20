package algoMath;

import java.util.Scanner;

/**
 * @file : MaxMin.java
 * @author KIM HYEHYEON
 * @date 2016. 3. 19.
 * @story 16.최대값, 최소값 구하기
 */
public class MaxMin {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] arr = new int[10];
		int i = 0, max = 0;
		
		System.out.print("10개의 수를 입력하세요 ");
		while (i < arr.length) {
			arr[i] = scanner.nextInt();
			i++;
		}
		
		for (i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		
		System.out.println("최대값 : " + max);
	}
}
