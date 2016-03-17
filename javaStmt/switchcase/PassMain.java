package switchcase;

import java.util.Scanner;

/**
 * @file : Pass.java
 * @author KIM HYEHYEON
 * @date 2016. 3. 11.
 * @story 과목 점수를 입력하면 총점과 평균이 나오고
 * 이를 통해 합격 여부를 통지하는 프로그램 (스위치케이스 처리)
 * [결과]
 * **************************************************
 * *학생	자바JSP	SQL	스프링	총점평균	합격여부	
 * *-------------------------------------------------
 * *홍길동	80	40	60	70		250	62.5	합격		
 * **************************************************
 * 합격 여부는 60 이상이면 합격
 */
public class PassMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("이름, 자바, JSP, SQL, 스프링 점수를 입력하세요 ");
		Pass pass = new Pass();
		pass.setData(scanner.next(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
		

		
		System.out.println("******************************************************************");
		System.out.println("*학생\t자바\tJSP\tSQL\t스프링\t총점\t평균\t합격여부");
		System.out.println("*-----------------------------------------------------------------");
		System.out.println("*" + pass.toString());
		System.out.println("******************************************************************");
	}
}
