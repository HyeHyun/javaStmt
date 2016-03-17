package ifelse;

public class Trinomial {
	private String name, result;
	private int kor, eng, math, avg;

	public void setName(String name) {
		this.name = name;
	}

	public void setScore(int kor, int eng, int math) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		
		setAvg();
	}

	public void setAvg() {
		this.avg = (int) ((kor + eng + math) / 3);
		
		setResult();
	}

	public void setResult() {
		this.result = (avg >= 60) ? "합격" : "불합격";
	}

	@Override
	public String toString() {
		return "Trinomial [이름=" + name + ", 국어=" + kor + ", 영어=" + eng + ", 수학=" + math + ", 평균=" + avg + ", 결과=" + result + "]";
	}
}
