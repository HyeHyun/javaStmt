package bank;

import java.util.Vector;

public class AdminServiceImpl implements AdminService {
	Vector<AccountBean> accountList;
	
	public AdminServiceImpl() {
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
	public boolean closeAccount(int accountNo) {
		// 계좌 해지
		boolean result = false;
		
		for (int i = 0; i < accountList.size(); i++) {
			if (accountList.get(i).getAccountNo() == accountNo) {
				accountList.remove(i);
				result = true;
			}
		}
		
		return result;
	}

	@Override
	public int countAll() {
		// 전체 계좌수 조회
		return accountList.size();
	}
}
