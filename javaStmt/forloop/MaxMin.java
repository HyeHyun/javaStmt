package forloop;

public class MaxMin {
	private int max, min;
	
	public void setMaxMin(int[] arr) {
		int max = arr[0], min = arr[0];
		
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		
		this.max = max;
		this.min = min;
	}
	
	@Override
	public String toString() {
		return "MaxMin [최대값=" + max + ", 최소값=" + min + "]";
	}
}
