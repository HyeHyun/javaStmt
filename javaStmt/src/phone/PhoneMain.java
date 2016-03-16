package phone;

import java.util.Scanner;

public class PhoneMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("=== 집 전화기로 통화 ===");
//		usePhone(scanner);
//		useNokia(scanner);	
//		useIphone(scanner);
		
		AndroidPhone androidPhone = new AndroidPhone();
		androidPhone.setCompany("LG");
		System.out.println(androidPhone.getCompany() + "를 사용");
		System.out.print("? , 메시지, 크기 ");
		androidPhone.setData(scanner.next(), scanner.next(), scanner.next());
		System.out.println(androidPhone.getCall());
	}

	public static void useIphone(Scanner scanner) {
		IPhone iPhone = new IPhone();
		iPhone.setCompany("애플");
		System.out.println(iPhone.getCompany() + "을 사용");
		System.out.print("? , 메시지 ");
		iPhone.setData(scanner.next(), scanner.next());
		System.out.println(iPhone.getCall());
	}

	public static void useNokia(Scanner scanner) {
		Phone nokia = new CellPhone(); // 부모의 타입으로 자식의 생성자를 통해 인스턴스를 생성할 수 있다.
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
