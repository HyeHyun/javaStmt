package forloop;

/**
 * @file : Gugudan.java
 * @author KIM HYEHYEON
 * @date 2016. 3. 11.
 * @story 2단부터 9단까지 구구단 출력
 * 단, 책받침 구구단으로 출력
 */
public class Gugudan {
	public static void main(String[] args) {
		System.out.println("2단부터 9단까지 구구단 출력 (단, 책받침 구구단으로 출력)");
		
		print(2, 5);
		print(6, 9);
	}
	
	public static void print(int x, int y) {
		int i, j;
		
		for (j = 1; j <= 9; j++) {
			for (i = x; i <= y; i++) {
				System.out.print(i + "*" + j + "=" + i * j + "\t");
			}
			System.out.println();
		}
		System.out.println();
	}
}
