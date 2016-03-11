package ifelse;

import java.util.Scanner;

/**
 * @file : GradeReport.java
 * @author KIM HYEHYEON
 * @date 2016. 3. 11.
 * @story 성적표(점수에 따라 A ~ F까지 학점부여)
 * [결과]
 * ******************************
 * *이름	과목	점수	학점*
 * *----------------------------*
 * *홍길동	영어	89		B	*
 * ******************************
 * 90 점 이상 A
 * 80 점 이상 B
 * 70 점 이상 C
 * 60 점 이상 D
 * 50 점 이상 E
 * 50 점 미만 F
 * 만약, 입력한 점수가 100점 초과한다든지 0점 미만이면
 * 잘못 입력했습니다. 라고 메시지 주기
 */
public class GradeReport {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("이름, 점수 입력 : ");
		String name = scanner.next();
		int score = scanner.nextInt();
		String result = "";
		
		if (score > 100 || score < 0) {
			System.out.println("잘못 입력했습니다.");
			return;
		}
		
		if (score >= 90) {
			result = "A";
		} else if (score >= 80) {
			result = "B";
		} else if (score >= 70) {
			result = "C";
		} else if (score >= 60) {
			result = "D";
		} else if (score >= 50) {
			result = "E";
		} else {
			result = "F";
		}
		
		System.out.println("*****************************");
		System.out.println("*이름\t과목\t점수\t학점");
		System.out.println("*----------------------------");
		System.out.println("*"+name+"\t영어\t" +score+"\t"+ result);
		System.out.println("*****************************");
	}
}
