package ifelse;

public class LeapYear {
	String yearStr;
	int year;

	public String getYearStr() {
		return yearStr;
	}

	public void setYearStr(int year) {
/*		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
			yearStr = "윤년";
		} else {
			yearStr = "평년";
		}*/
	
		yearStr = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)? "윤년" : "평년";
		
		this.year = year;
	}

	@Override
	public String toString() {
		return "LeapYear [" + year + "년은 " + yearStr + "입니다.]";
	}
}
