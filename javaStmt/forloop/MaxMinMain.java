package forloop;

import java.util.Scanner;

/**
 * @file : MaxMin.java
 * @author KIM HYEHYEON
 * @date 2016. 3. 11.
 * @story 최고점, 최저점 구하기
 * [결과]
 * 학생들 평균 점수를 입력하시면 최고점, 최저점이 줄력됩니다.
 * 단, 정원은 5명 입니다.
 * 평균점수를 입력하세요
 * 
 * 최고점은 100 점이고
 * 최저점은 30 점 입니다.
 */
public class MaxMinMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] arr = new int[5];
		
		System.out.print("학생들 평균 점수를 입력하시면 최고점, 최저점이 줄력됩니다. 단, 정원은 5명 입니다. 평균점수를 입력하세요 ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}

		MaxMin maxmin = new MaxMin();
		maxmin.setMaxMin(arr);
		
		System.out.println(maxmin.toString());
	}
}
