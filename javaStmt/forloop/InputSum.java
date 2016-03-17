package forloop;

public class InputSum {
	private int endNum, sum = 0, i;

	public void setEndNum(int endNum) {
		this.endNum = endNum;
		setSum();
	}

	public void setSum() {
		for (i = 1; i <= endNum; i++) {
			sum += i;
		}
		
		this.sum = sum;
	}

	@Override
	public String toString() {
		return "InputSum [1부터 " + endNum + "까지의 합=" + sum + "]";
	}
}
