package ifelse;

public class Pass {
	int java, jsp, sql, spring, sum;
	double avg;
	String name, result;
	
	public void setData(String name, int java, int jsp, int sql, int spring) {
		sum = java + jsp + sql + spring;
		avg = (double)sum / 4;
		
		if (avg >= 60) {
			result = "합격";
		} else {
			result = "불합격";
		}
		
		this.name = name;
		this.java = java;
		this.jsp = jsp;
		this.sql = sql;
		this.spring = spring;
		this.sum = sum;
		this.avg = avg;
	}

	@Override
	public String toString() {
		return name + "\t" + java + "\t" + jsp + "\t" + sql + "\t" + spring + "\t" + sum + "\t" + avg + "\t" + result;
	}
}
