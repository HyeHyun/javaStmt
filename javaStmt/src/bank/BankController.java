package bank;

import java.util.Scanner;

public class BankController {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		BankService service = new BankServiceImpl();
		
		while (true) {
			System.out.print("[메뉴] 1.계좌개설 2.목록 3.입금 4.출금 5.잔액조회 0.종료 ");
			
			switch (scanner.nextInt()) {
			case 1:
				System.out.print("이름과 비밀번호를 입력하세요 ");
				service.openAccount(scanner.next(), scanner.nextInt());
				break;
			case 2:
				System.out.println(service.getList());
				break;
			case 3:
				System.out.print("계좌번호와 입금할 금액을 입력하세요 ");
				System.out.println(service.deposit(scanner.nextInt(), scanner.nextInt()));
				break;
			case 4:
				System.out.print("계좌번호와 출금할 금액을 입력하세요 ");
				System.out.println(service.withdraw(scanner.nextInt(), scanner.nextInt()));
				break;
			case 5:
				System.out.print("조회할 계좌번호를 입력하세요 ");
				AccountBean account = service.findAccount(scanner.nextInt());
				System.out.println(account == null ? "존재하지 않는 계좌번호입니다." : account);
				break;
				
			case 0:
				System.out.println("프로그램 종료");
				return;

			default:
				System.out.println("잘못 입력하셨습니다.");
				return;
			}
		}
	}
}
