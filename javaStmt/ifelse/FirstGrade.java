package ifelse;

public class FirstGrade {
	int maxScore;
	String maxName;
	
	public void setData(String name, int score) {
		if (maxScore < score) {
			setMaxScore(score);
			setMaxName(name);
		} 
	}

	public void setMaxScore(int score) {
		maxScore = score;
	}

	public void setMaxName(String name) {
		maxName = name;
	}

	@Override
	public String toString() {
		return "FirstGrade [1등은 " + maxName + ", 점수는 " + maxScore + "]";
	}
}
