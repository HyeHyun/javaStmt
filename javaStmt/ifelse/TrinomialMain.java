package ifelse;

import java.util.Scanner;

public class TrinomialMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("이름, 국어, 영어, 수학 점수를 입력하세요 ");
		Trinomial trinomial = new Trinomial();
		trinomial.setName(scanner.next());
		trinomial.setScore(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());

		System.out.println(trinomial.toString());
	}
}
