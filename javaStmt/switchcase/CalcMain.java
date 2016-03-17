package switchcase;

import java.util.Scanner;

/**
 * @file : Calc.java
 * @author KIM HYEHYEON
 * @date 2016. 3. 11.
 * @story 사칙연산기
 */
public class CalcMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("숫자, 연산기호, 숫자를 입력하세요 ");
		Calc calc = new Calc();
		calc.setResult(scanner.nextInt(), scanner.next(), scanner.nextInt());
		
		System.out.println(calc.toString());
	}
}
