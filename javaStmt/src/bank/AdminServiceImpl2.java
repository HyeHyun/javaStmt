package bank;

/**
 * @file : BankServiceImpl.java
 * @author KIM HYEHYEON
 * @date 2016. 3. 10.
 * @story 뱅크 서비스 비즈니스 로직
 */
public class AdminServiceImpl2 implements AdminService2 {
	private AccountBean[] accountList; // 전체 계좌를 보관하는 객체
	private int count; // 전체 통장 계좌 수
	
	public AdminServiceImpl2(int size) {
		// accountList 를 초기화 해줌
		accountList = new AccountBean[size];
	}

	@Override
	public String openAccount(String name, int password) {
		// 계좌 개설
		AccountBean bean = new AccountBean(name, password);
		count++;		
		return bean.toString();
	}

	@Override
	public AccountBean findAccountByAccountNo(int accountNo) {
		// 계좌번호로 계좌 조회(반드시 하나만 검색됨)
		AccountBean temp = new AccountBean();
		for (int i = 0; i < count; i++) {
			if (accountNo == accountList[i].getAccountNo()) {
				temp = accountList[i];
				break;
			}
		}
		return temp;
	}

	@Override
	public AccountBean[] findAccountsByName(String name) {
		// 이름으로 계좌 조회(복수개의 결과가능)
		 AccountBean[] tempList = new AccountBean[countByName(name)];
		 for (int i = 0, j = 0; i < count; i++) {
			if (name == accountList[i].getName()) {
				tempList[j] = accountList[i];
				j++;
			}
		}
		return tempList;
	}

	@Override
	public String closeAccount(int accountNo) {
		// 계좌 해지
		for (int i = 0; i < count; i++) {
			if(true) {
				accountList[i] = null;
			}
		}
		return null;
	}

	@Override
	public int countAll() {
		// 전체 계좌수 조회
		return count;
	}

	@Override
	public int countByName(String name) {
		// 해당 이름에 맞는 계좌 수 조회
		int countByName = 0;
		for (int i = 0; i < count; i++) {
			if(name == accountList[i].getName())
				countByName++;
		}
		return countByName;
	}
}
