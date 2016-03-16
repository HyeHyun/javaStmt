package bank;

import java.util.Vector;

public interface BankService {
	/**
	 * 계좌 개설
	 */
	public void openAccount(String name, int password);
	/**
	 * 전체 계좌 목록 출력
	 * */
	public Vector<AccountBean> getList();
	/**
	 * 입금
	 * */ 
	public String deposit(int accountNo, int money);
	/**
	 * 출금
	 * */
	public String withdraw(int accountNo, int money);
	/**
	 * 잔액조회
	 * */
	public AccountBean findAccount(int accountNo);
}
