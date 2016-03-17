package ifelse;

import java.util.Scanner;

/**
 * @file : GradeReport.java
 * @author KIM HYEHYEON
 * @date 2016. 3. 11.
 * @story 성적표(점수에 따라 A ~ F까지 학점부여)
 * [결과]
 * *************************
 * *이름		과목	점수	학점
 * *------------------------
 * *홍길동	영어	89	B	
 * *************************
 * 90 점 이상 A
 * 80 점 이상 B
 * 70 점 이상 C
 * 60 점 이상 D
 * 50 점 이상 E
 * 50 점 미만 F
 * 만약, 입력한 점수가 100점 초과한다든지 0점 미만이면
 * 잘못 입력했습니다. 라고 메시지 주기
 */
public class GradeReportMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("이름과 점수를 입력하세요 ");
		GradeReport grade = new GradeReport();
		grade.setData(scanner.next(), scanner.nextInt());
		
		System.out.println("*****************************");
		System.out.println("*이름\t과목\t점수\t학점");
		System.out.println("*----------------------------");
		System.out.println("*" + grade.toString());
		System.out.println("*****************************");
	}
}
