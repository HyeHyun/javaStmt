package bank;

import java.util.Vector;

public interface AdminService {
	/**
	 * 계좌 개설
	 */
	public void openAccount(String name, int password);
	/**
	 * 전체 계좌 목록 출력
	 * */
	public Vector<AccountBean> getList();
	/**
	 * 계좌번호로 계좌 조회(반드시 하나만 검색됨)
	 * */
	public AccountBean findAccountByAccountNo(int accountNo);
	/**
	 * 이름으로 계좌 조회(복수개의 결과가능)
	 * */
	public Vector<AccountBean> findAccountsByName(String name);
	/**
	 * 계좌 해지
	 * */
	public boolean closeAccount(int accountNo);
	/**
	 * 전체 계좌수 조회
	 * */
	public int countAll();
}
