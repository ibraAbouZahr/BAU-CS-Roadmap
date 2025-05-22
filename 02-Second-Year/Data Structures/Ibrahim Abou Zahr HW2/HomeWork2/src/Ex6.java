
public class Ex6 {
	public int lengthLongestIncreasingSubarray(int a[]) {
		int length = 0;
		int max = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 1; j < a.length; j++) {
				if (a[j] > a[i]) {
					length++;
				} else {
					length = 0;
				}
				max = length;

				if (length > max) {
					max = length;
				}
			}
		}
		return max;
	}
	//Time complexity is O(N^2)
}
