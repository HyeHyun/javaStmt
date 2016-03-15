package bank;

import java.util.Vector;

public class AdminServiceImpl implements AdminService {
	AccountBean account;
	Vector<AccountBean> accountList;
	
	public AdminServiceImpl() {
		accountList = new Vector<AccountBean>();
	}
	
	@Override
	public String openAccount(String name, int password) {
		// 계좌 개설
		account = new AccountBean(name, password);
		accountList.add(account);
		
		return account.toString();
	}

	@Override
	public Vector<AccountBean> getList() {
		// 전체 계좌 목록 출력
		return accountList;
	}

	@Override
	public AccountBean findAccountByAccountNo(int accountNo) {
		// 계좌번호로 계좌 조회(반드시 하나만 검색됨)
		for (int i = 0; i < accountList.size(); i++) {
			if (accountList.get(i).getAccountNo() == accountNo) {
				return accountList.get(i);
			}
		}
		
		return null;
	}

	@Override
	public Vector<AccountBean> findAccountsByName(String name) {
		// 이름으로 계좌 조회(복수개의 결과가능)
		Vector<AccountBean> tempList = new Vector<AccountBean>();
		
		for (int i = 0; i < accountList.size(); i++) {
			if (accountList.get(i).getName().equals(name)) {
				tempList.add(accountList.get(i));
			}
		}
		
		return tempList;
	}

	@Override
	public String closeAccount(int accountNo) {
		// 계좌 해지
		for (int i = 0; i < accountList.size(); i++) {
			if (accountList.get(i).getAccountNo() == accountNo) {
				accountList.remove(i);
			}
		}
		
		return account.toString();
	}

	@Override
	public int countAll() {
		// 전체 계좌수 조회
		return accountList.size();
	}

	@Override
	public int countByName(String name) {
		// 해당 이름에 맞는 계좌 수 조회
		return findAccountsByName(name).size();
	}
}
