package bank;

import java.util.Scanner;

public class BankMain {
	public static void main(String[] args) {
		// 지역변수 영역
		Scanner scanner = new Scanner(System.in);
		BankServiceImpl service = new BankServiceImpl();
		AdminServiceImpl2 admin = new AdminServiceImpl2(100);
		
		// 연산영역
/*		System.out.print("이름, 비밀번호 : ");		
		service.openAccount(scanner.next(), scanner.nextInt());
		
		System.out.print("입금 : ");
		System.out.println(service.deposit(scanner.nextInt()));
		
		System.out.print("출금 : ");
		System.out.println(service.withdraw(scanner.nextInt()));
		
		System.out.print("잔액조회 : ");
		System.out.println(service.findMoney());*/
	}
}
