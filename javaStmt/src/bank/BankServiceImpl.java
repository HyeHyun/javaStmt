package bank;

public class BankServiceImpl implements BankService {
	private AccountBean account;
	
	@Override
	public String openAccount(String name, int password) {
		// 계좌 개설
		account = new AccountBean(name, password);
		return account.toString();
	}

	@Override
	public String deposit(int money) {
		// 입금
		account.setMoney(account.getMoney() + money);
		return account.toString();
	}

	@Override
	public String withdraw(int money) {
		// 출금
		account.setMoney(account.getMoney() - money);
		return account.toString();
	}

	@Override
	public String findMoney() {
		// 잔액조회
		return account.toString();
	}
}
