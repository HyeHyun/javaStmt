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
		int i = 0, j = 9, k = 0, l = 0; // j : 차이값 중 최소값, k : 7과 비교대상의 차이값, m : 7과 가장 가까운 값
		int[] arr = new int[10];
		
		System.out.print("한자리수 10개를 입력하세요 ");
		while (i < arr.length) {
			arr[i] = scanner.nextInt();
			i++;
		}
		
		for (i = 0;  i < arr.length; i++) {
			if (arr[i] > 7) {
				k = arr[i] - 7;
			} else {
				k = 7 - arr[i];
			}
			
			if (j >= k) {
				j = k;
				l = arr[i];
			}
		}
		
		System.out.println("7과 가장 가까운 값 : " + l);
	}
}
