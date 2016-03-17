package ifelse;

import java.util.Scanner;

/**
 * @file : TimeCalc.java
 * @author KIM HYEHYEON
 * @date 2016. 3. 11.
 * @story 초를 입력하면 시간, 분, 초를 출력하는 프로그램
 * 10000초를 입력하면 2시간 46분 40초 로 출력
 */
public class TimeCalcMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("초를 입력하세요 ");
		TimeCalc time = new TimeCalc();
		time.setTime(scanner.nextInt());
		
		System.out.println(time.toString());
	}
}
