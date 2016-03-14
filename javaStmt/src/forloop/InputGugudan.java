package forloop;

public class InputGugudan {
	private int dan, i;

	public void setDan(int dan) {
		this.dan = dan;
	}
	
	public void setI(int i) {
		this.i = i;
	}

	@Override
	public String toString() {
		return dan + "*" + i + " = " + dan * i;
	}
}
