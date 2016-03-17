package ifelse;

import java.util.Scanner;

/**
 * @file : FirstGrade.java
 * @author KIM HYEHYEON
 * @date 2016. 3. 11.
 * @story 3명의 학생 점수를 받아서 1등을 출력하는 프로그램
 */
public class FirstGradeMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		FirstGrade grade = new FirstGrade();
		for (int i = 0; i < 3; i++) {
			System.out.print("이름과 점수를 입력하세요 ");
			grade.setData(scanner.next(), scanner.nextInt());
		}

		System.out.println(grade.toString());
	}
}
