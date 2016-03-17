package switchcase;

import java.util.Scanner;
import ifelse.LeapYear;

/**
 * @file : MonthEndDay.java
 * @author KIM HYEHYEON
 * @date 2016. 3. 11.
 * @story 해당 월의 말일을 출력함
 * 예를 들면 1월이면 31일 출력
 */
public class MonthEndDayMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("년도, 월을 입력하세요 ");
		MonthEndDay med = new MonthEndDay();
		med.setMonthEndDay(scanner.nextInt(), scanner.nextInt());

		System.out.println(med.toString());
	}
}
