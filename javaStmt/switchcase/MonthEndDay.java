package switchcase;

import ifelse.LeapYear;

public class MonthEndDay {
	String yearStr, result;
	
	public void setMonthEndDay(int year, int month) {
		LeapYear ly = new LeapYear();
		ly.setYearStr(year);
		yearStr = ly.getYearStr();
		
		switch (month) {
		case 1:case 3:case 5:case 7:case 8:case 10:case 12:
			result = year + "년 " + month + "월은 31일이 말일입니다.";
			break;
		case 4:case 6:case 9:case 11:
			result = year + "년 " + month + "월은 30일이 말일입니다.";
			break;
		
		case 2:
			if (yearStr == "윤년") {
				result = year + "년 " + month + "월은 29일이 말일입니다.";
				break;
			} else {
				result = year + "년 " + month + "월은 28일이 말일입니다.";
				break;
			}
		
		default:
			result = "잘못된 값";
			return;
		}
	}
	
	@Override
	public String toString() {
		return result;
	}
}
