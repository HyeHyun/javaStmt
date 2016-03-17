package switchcase;

public class Pass {
	int sum, java, jsp, sql, spring;
	double avg;
	String result, name;
	
	public void setData(String name, int java, int jsp, int sql, int spring) {
		sum = java + jsp + sql + spring;
		avg = (double)sum / 4;
		
		switch ((int)avg/10) {
		case 6:case 7:case 8:case 9:case 10: result = "합격";break;
		default: result = "불합격";break;
		}
		
		this.name = name;
		this.java = java;
		this.jsp = jsp;
		this.sql = sql;
		this.spring = spring;
	}

	@Override
	public String toString() {
		return name + "\t" + java + "\t" + jsp + "\t" + sql + "\t" + spring + "\t" + sum + "\t" + avg + "\t" + result;
	}
}
