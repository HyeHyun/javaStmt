package forloop;

import java.util.Scanner;

/**
 * @file : Tax.java
 * @author KIM HYEHYEON
 * @date 2016. 3. 11.
 * @story 이름과 연봉을 입력받아서 다음과 같은 결과물이 나오도록 출력하시오
 * 세율은 10%
 * [결과]
 * 연봉 *** 만원을 받으시는 **님께서
 * 이번달 납부할 세금은 *** 만원입니다.
 */
public class Tax {
	public static void main(String[] args) {
		System.out.print("이름과 연봉을 입력하세요 ");
		String name;
		int salary;
		Scanner scanner = new Scanner(System.in);
		
		name = scanner.next();
		salary = scanner.nextInt();
		
		System.out.println("연봉 " + salary + "만원을 받으시는 " + name + "님께서 이번달 납부할 세금은 " + (int) (salary * 0.1 / 12) + "만원 입니다.");
	}
}
