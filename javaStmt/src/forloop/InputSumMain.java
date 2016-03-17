package forloop;

import java.util.Scanner;

/**
 * @file : InputSum.java
 * @author KIM HYEHYEON
 * @date 2016. 3. 11.
 * @story 1부터 입력된 수까지의 정수의 합 구하기
 * 예) 10을 입력하면 콘솔에는 1부터 10까지의 합은 55입니다.
 */
public class InputSumMain {
	public static void main(String[] args) {
		int sum = 0, endNum = 0, i;
		Scanner scanner = new Scanner(System.in);

		System.out.print("1부터 입력된 수까지의 정수의 합 구하기. 리미트값을 입력하세요 ");
		InputSum input = new InputSum();
		input.setEndNum(scanner.nextInt());

		System.out.println(input.toString());
	}
}
