
public class Ex4 {
	public void rotate(int a[], int n) {
		for (int i = 0; i < n; i++) {
			int last = a[a.length - 1];

			for (int j = a.length - 1; j > 0; j--) {
				a[j] = a[j - 1];

			}
			a[0] = last;
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
	// Time complexity: N^2 + N + 1 +1 = O(N^2);

}
