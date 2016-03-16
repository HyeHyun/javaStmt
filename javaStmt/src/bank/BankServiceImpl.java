package bank;

import java.util.Vector;

public class BankServiceImpl implements BankService {
	AccountBean account = new AccountBean();
	Vector<AccountBean> accountList;
	
	public BankServiceImpl() {
		accountList = new Vector<AccountBean>();
	}
	
	@Override
	public void openAccount(String name, int password) {
		// 계좌 개설
		accountList.add(new AccountBean(name, password));
	}
	
	@Override
	public Vector<AccountBean> getList() {
		// 전체 계좌 목록 출력
		return accountList;
	}

	@Override
	public String deposit(int accountNo, int money) {
		// 입금
		account = findAccount(accountNo);
		String result = "";
		
		if (account == null) {
			result = "존재하지 않는 계좌입니다.";
		} else {
			account.setMoney(account.getMoney() + money);
			result = "입금 완료";
		}
		
		return result;
	}

	@Override
	public String withdraw(int accountNo, int money) {
		// 출금
		account = findAccount(accountNo);
		String result = "";
		
		if (account == null) {
			result = "존재하지 않는 계좌입니다.";
		} else {
			account.setMoney(account.getMoney() - money);
			result = "출금 완료";
		}
		
		return result;
	}

	@Override
	public AccountBean findAccount(int accountNo) {
		// 잔액조회
		for (int i = 0; i < accountList.size(); i++) {
			if (accountList.get(i).getAccountNo() == accountNo) {
				return accountList.get(i);
			}
		}
		
		return null;
	}
}
