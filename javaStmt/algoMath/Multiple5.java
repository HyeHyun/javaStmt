package algoMath;

/**
 * @file : Multiple5.java
 * @author KIM HYEHYEON
 * @date 2016. 3. 19.
 * @story 17.5의 배수의 개수와 합
 */
public class Multiple5 {
	public static void main(String[] args) {
		int count = 0, sum = 0, i, mok, nmg;
		
		for (i = 1; i <= 100; i++) {
			mok = i/5;
			nmg = i - (mok * 5);
			
			if (nmg == 0) {
				count++;
				sum += i;
			}
		}
		
		System.out.println("5의 배수의 개수 : " + count + ", 합 : " + sum);
	}
}
