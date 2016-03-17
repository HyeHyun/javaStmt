package ifelse;

public class BigNumber {
	int big;
	
	public void setBig(int a, int b, int c) {
		big = a;
		
		if (big < b) {
			big = b;
		}
		
		if (big < c) {
			big = c;
		}
		
		this.big = big;
	}

	@Override
	public String toString() {
		return "BigNumber [가장큰수=" + big + "]";
	}
}
