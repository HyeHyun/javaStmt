package ifelse;

public class GradeReport {
	String name, result;
	int score;
	
	public void setData(String name, int score) {
		if (score > 100 || score < 0) {
			result = "오류";
		} else if (score >= 90) {
			result = "A";
		} else if (score >= 80) {
			result = "B";
		} else if (score >= 70) {
			result = "C";
		} else if (score >= 60) {
			result = "D";
		} else if (score >= 50) {
			result = "E";
		} else {
			result = "F";
		}
		
		this.name = name;
		this.score = score;
	}

	@Override
	public String toString() {
		return name + "\t영어\t" + score + "\t" + result;
	}
}
