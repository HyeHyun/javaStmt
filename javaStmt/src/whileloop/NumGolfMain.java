package whileloop;

import java.util.*;

/**
 * @file : NumGolfMain.java
 * @author KIM HYEHYEON
 * @date 2016. 3. 10.
 * @story 컴퓨터가 랜덤 생성한 숫자를 가장 빠른 횟수로 맞추는 게임
 */
public class NumGolfMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		NumGolfBean bean = new NumGolfBean();

		System.out.println("컴퓨터 랜덤 수 발생");
		bean.setCom();

		while (true) {
			System.out.print("[메뉴] 1.숫자 맞추기\t2.종료 ");
			int key = scanner.nextInt();
			
			switch (key) {
			case 1: 
				System.out.print("1부터 10까지 숫자 중 하나를 입력하세요 ");
				bean.setPlayer(scanner.nextInt());
				bean.setCount();
				bean.setFlag();
				
				System.out.println(bean.toString());
				break;
			case 2:
				System.out.println("종료합니다.");
				return;
			default:
				System.out.println("잘못된 값");
				break;
			}
			
			if (bean.isFlag()) {
				break;
			}
		}
	}
}
