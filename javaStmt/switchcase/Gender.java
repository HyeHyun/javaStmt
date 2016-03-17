package switchcase;

public class Gender {
	String name, ssn, result;
	
	public void setData(String name, String ssn) {
		/**
		 * 800101-1234567 일때
		 * charAt(인덱스값) 은 인덱스에 해당하는 한 글자를 반환
		 * 단, 인덱스는 0부터 시작함
		 * 1, 3 이면 남자
		 * 2, 4 이면 여자
		 * 5, 6 이면 외국인
		 * 다른 값이면 잘못된 주민번호입니다.
		 * */

		switch (ssn.charAt(7)) {
		case '1':case '3': result = name + "은 남자입니다.";break;
		case '2':case '4': result = name + "은 여자입니다.";break;
		case '5':case '6': result = name + "은 외국인입니다.";break;

		default:
			result = "잘못된 주민번호입니다.";
			return;
		}
	}

	@Override
	public String toString() {
		return result;
	}
}
