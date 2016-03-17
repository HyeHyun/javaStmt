package switchcase;

import java.util.Scanner;

/**
 * @file : Gender.java
 * @author KIM HYEHYEON
 * @date 2016. 3. 11.
 * @story 주민번호를 가지고 성별 판별하는 로직(스위치케이스 사용)
 */
public class GenderMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("이름, 주민번호를 입력하세요 ");
		Gender gender = new Gender();
		gender.setData(scanner.next(), scanner.next());

		System.out.println(gender.toString());
	}
}
