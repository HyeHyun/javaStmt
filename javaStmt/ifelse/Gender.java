package ifelse;

public class Gender {
	String result, name, ssn;
	char flag;
	
	public void setData(String name, String ssn) {
		flag = ssn.charAt(7);
		/**
		 * 800101-1234567 일때
		 * charAt(인덱스값) 은 인덱스에 해당하는 한 글자를 반환
		 * 단, 인덱스는 0부터 시작함
		 * 1, 3 이면 남자
		 * 2, 4 이면 여자
		 * 5, 6 이면 외국인
		 * 다른 값이면 잘못된 주민번호입니다.
		 * */
		
		if (flag =='1' || flag == '3') {
			result = "남자";
		} else if (flag == '2' || flag == '4') {
			result = "여자";
		} else if (flag == '5' || flag == '6') {
			result = "외국인";
		} else {
			result = "잘못된 주민번호입니다.";
		}
		
		this.name = name;
		this.ssn = ssn;
	}

	@Override
	public String toString() {
		return "Gender [이름=" + name + ", 주민등록번호=" + ssn + ", 결과=" + result + "]";
	}
}
