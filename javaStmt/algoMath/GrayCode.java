package algoMath;

import java.util.Scanner;

/**
 * @file : GrayCode.java
 * @author KIM HYEHYEON
 * @date 2016. 3. 19.
 * @story 20.그레이 코드 변환하기
 * 0 또는 1로 입력되는 다섯 개의 숫자를 배열에 입력 받아 그레이 코드 또는 이진수로 변환
 */
public class GrayCode {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] INPUT = new int[5], COUNT = new int[4];
		int i;
		
		System.out.print("0 또는 1 다섯개의 숫자를 입력하세요 ");
		for (i = 0; i < INPUT.length; i++) {
			INPUT[i] = scanner.nextInt();
		}
		
		COUNT[0] = INPUT[1];
		
		if (INPUT[0] == 1) { // 그레이코드
			for (i = 0; i < 3; i++) {
				if (COUNT[i] == INPUT[i+2]) {
					COUNT[i+1] = 0;
				} else {
					COUNT[i+1] = 1;
				}
			}
		} else { // 이진수
			for (i = 0; i < 3; i++) {
				if (INPUT[i+1] == INPUT[i+2]) {
					COUNT[i+1] = 0;
				} else {
					COUNT[i+1] = 1;
				}
			}
		}
		
		System.out.print("COUNT >> ");
		for (i = 0; i < COUNT.length; i++) {
			System.out.print(COUNT[i]);
		}
	}
}
