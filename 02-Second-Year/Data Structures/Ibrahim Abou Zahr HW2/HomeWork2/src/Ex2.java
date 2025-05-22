
public class Ex2 {

	public int mostFrequentElement(int a[]) {
		int max = 0;
		int count = 0;
		int f = 0;
		for (int i = 0; i < a.length; i++) {
			for(int j = 0; j < a.length ; j++) {
				if(a[i] == a[j]) {
					count++;
				}
				if(count > max) {
					max = count;
					f = a[i];
				}
			}

		}
		return f;
	}
	// Time Complexity: N*N + 1 + 1 + 1 = N^2 = O(N^2)
}