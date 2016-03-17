package ifelse;

import java.util.Scanner;

/**
 * @file : TimeCalc.java
 * @author KIM HYEHYEON
 * @date 2016. 3. 11.
 * @story 초를 입력하면 시간, 분, 초를 출력하는 프로그램
 * 10000초를 입력하면 2시간 46분 40초 로 출력
 */
public class TimeCalc {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("초를 입력하세요 ");
		int time = scanner.nextInt(), hour, minute, second;
		
		if (time < 0) {
			System.out.println("초를 잘못입력하셨습니다.");
		} else {
			hour = time / 3600;
			minute = time % 3600 / 60;
			second = time % 60;
			
			System.out.println(time + "초는 " + hour + "시간 " + minute + "분 " + second + "초 입니다.");
		}
	}
}
