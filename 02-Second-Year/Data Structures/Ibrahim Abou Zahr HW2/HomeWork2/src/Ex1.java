
public class Ex1 {

	public int[] Intersection(int a[], int b[]) {
		int size = 0;

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (a[i] == b[j]) {
					size++;

				}
			}
		}
		int c[] = new int[size];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (a[i] == b[j]) {
					c[i] = b[i];
				}
			}
		}
		return c;
	}
	// Time Complexity : N^2 + N^2 + 1 + 1 + 1 + 1 = O(N^2)
}