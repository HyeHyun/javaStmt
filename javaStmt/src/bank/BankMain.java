package bank;

import java.util.Scanner;

public class BankMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("이름, 비밀번호 >> ");
		AccountBean bean = new AccountBean(scanner.next(), scanner.nextInt());
		System.out.println(bean.toString());
	}
}
