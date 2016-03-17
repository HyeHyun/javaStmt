package array;

public class MaxValue {
	int max;

	public int getMax(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}

		return max;
	}

	public void setMax(int max) {
		this.max = max;
	}
}
