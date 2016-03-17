package bank;

import java.util.*;

public class AdminController {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		AdminService service = new AdminServiceImpl();
		
		while (true) {
			System.out.print("[메뉴] 1.개설 2.목록 3.조회(계좌번호) 4.조회(이름) 5.계좌수 6.해지 0.종료 ");
			
			switch (scanner.nextInt()) {
			case 1:
				System.out.print("이름과 비밀번호를 입력하세요 ");
				service.openAccount(scanner.next(), scanner.nextInt());
				break;
			case 2:
				System.out.println(service.getList());
				break;
			case 3:
				System.out.print("계좌번호를 입력하세요 ");
				AccountBean account = service.findAccountByAccountNo(scanner.nextInt());
				System.out.println(account == null ? "존재하지 않는 계좌번호입니다." : account);
				break;
			case 4:
				System.out.print("이름을 입력하세요 ");
				Vector<AccountBean> accountList = service.findAccountsByName(scanner.next());
				System.out.println(accountList.size() == 0 ? "등록된 계좌번호가 없습니다." : accountList);
				break;
			case 5:
				System.out.println(service.countAll());
				break;
			case 6:
				System.out.print("계좌번호를 입력하세요 ");
				System.out.println(service.closeAccount(scanner.nextInt()) ? "계좌 해지 성공" : "계좌 해지 실패");
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
