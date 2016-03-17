package forloop;

/**
 * @file : PrintOneToTen.java
 * @author KIM HYEHYEON
 * @date 2016. 3. 11.
 * @story 1부터 10까지 정수값 출력(가로로 출력, \t 탭역할)
 */
public class PrintOneToTen {
	public static void main(String[] args) {
		System.out.println("1부터 10까지 정수값 출력(가로로 출력)");
		
		for(int i=1; i<=10; i++) {
			System.out.print(i + "\t");
		}
	}
}
