package ifelse;

import java.util.Scanner;

/**
 * @file : LeapYear.java
 * @author KIM HYEHYEON
 * @date 2016. 3. 11.
 * @story 윤년 프로그램
 * 연도를 4로 나눈값이 0이라면 윤년일 수 있다
 * 그러나 해당 년도가 100으로 나누어 떨어지면 평년이다
 * 그 중 100으로 나누어 떨어지더라도 다시 400으로 나누어 떨어지면 윤년이다
 * 예를 들면 1000년은 평년, 2000년은 윤년, 2016년은 윤년입니다.
 */
public class LeapYear {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("판별하려는 년도를 입력하세요 ");
		int year = scanner.nextInt();
	
		System.out.println(year + "년은 " + yearStr(year) + "입니다.");
	}
	
	public static String yearStr(int year) {
		String yearStr = "";
		
/*		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
			yearStr = "윤년";
		} else {
			yearStr = "평년";
		}*/
		
		yearStr = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)? "윤년" : "평년";
		
		return yearStr;
	}
}
