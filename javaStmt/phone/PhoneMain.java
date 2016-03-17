package phone;

import java.util.Scanner;

public class PhoneMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("=== 집 전화기로 통화 ===");
		PhoneMain pm = new PhoneMain();
//		pm.usePhone(scanner);
//		pm.useNokia(scanner);	
//		pm.useIphone(scanner);
		pm.useAndroidPhone(scanner);
	}

	public void useAndroidPhone(Scanner scanner) {
		Phone and = new AndroidPhone();
		and.setCompany("안드로이드");
		System.out.println(and.getCompany() + "를 사용");
		System.out.print("? , 메시지 ");
		((AndroidPhone) and).setData(scanner.next(), scanner.next(), "6인치");
		System.out.println(((AndroidPhone) and).getData());
	}

	public void useIphone(Scanner scanner) {
		Phone iPhone = new IPhone();
		iPhone.setCompany("애플");
		System.out.println(iPhone.getCompany() + "을 사용");
		System.out.print("? , 메시지 ");
		((IPhone) iPhone).setData(scanner.next(), scanner.next());
		System.out.println(((AndroidPhone) iPhone).getData());
	}

	public void useNokia(Scanner scanner) {
		Phone nokia = new CellPhone(); // Deep Copy
		// 부모의 타입으로 자식의 생성자를 통해 인스턴스를 생성할 수 있다.
		nokia.setCompany("노키아");
		System.out.println(nokia.getCompany() + "를 사용");
		System.out.print("휴대폰으로 통화할 사람? ");
		nokia.setCall(scanner.next());
		System.out.println(nokia.getCall());
	}

	public static void usePhone(Scanner scanner) {
		Phone phone = new Phone();
		phone.setCompany("삼성집전화기");
		System.out.println(phone.getCompany() + "를 사용합니다.");
		System.out.print("통화할 사람? ");
		phone.setCall(scanner.next());
		System.out.println(phone.getCall());
	}
}
