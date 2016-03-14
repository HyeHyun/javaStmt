package forloop;

public class FactorOf5 {
	int endNum, count = 0, sum = 0;
	
	public void setValue(int endNum) {
		for (int i = 1; i <= endNum; i++) {
			if (i % 5 == 0) {
				count++;
				sum += i;
			}
		}
		
		this.endNum = endNum;
		this.count = count;
		this.sum = sum;
	}

	@Override
	public String toString() {
		return "FactorOf5 [1부터 " + endNum + "까지 5배수의 갯수=" + count + ", 5배수의 합=" + sum + "]";
	}
	
}
