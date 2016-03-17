package ifelse;

public class TimeCalc {
	int time, hour, minute, second;
	
	public void setTime(int time) {
		this.time = time;

		this.hour = time / 3600;
		this.minute = time % 3600 / 60;
		this.second = time % 60;
	}

	@Override
	public String toString() {
		if(time < 0) {
			return "초를 잘못입력하셨습니다.";
		} else {
			return time + "초는 " + hour + "시간 " + minute + "분 " + second + "초 입니다.";
		}
	}	
}
