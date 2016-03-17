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
		System.out.print("3명의 이름과 점수를 입력하세요 ");
		String aName = scanner.next();
		int aScore = scanner.nextInt();
		String bName = scanner.next();
		int bScore = scanner.nextInt();
		String cName = scanner.next();
		int cScore = scanner.nextInt();
		String maxName = aName;
		int maxScore = aScore;
		
		if (maxScore < bScore) {
			maxScore = bScore;
			maxName = bName;
		} 
		
		if (maxScore < cScore) {
			maxScore = cScore;
			maxName = cName;
		} 
		
		System.out.println("1등은 " + maxName + ", " + maxScore + "점 입니다.");
	}
}
