
public class Ex5 {
	public int[] merge(int a[], int b[]) {
		
		for(int i = 0; i < a.length; i++) {
			for(int j = 1; j < a.length; j++) {
				if(a[j] > a[j-1]) {
					int temp = a[j-1];
					a[j-1] = a[j];
					a[j] = temp;
				}
			}
		}
		for(int i = 0; i < b.length; i++) {
			for(int j = 1; j < b.length; j++) {
				if(b[j] > b[j-1]) {
					int temp = b[j-1];
					b[j-1] = b[j];
					b[j] = temp;
				}
			}
		}
		int c[] = new int [a.length + b.length];
		for(int i = 0; i < a.length; i++) {
			c[i] = a[i];
		}
		for(int i = b.length; i < c.length; i++) {
			c[i] = b[i];
		}
		return c;
	}
	// Time complexity: O(N^2)

}
