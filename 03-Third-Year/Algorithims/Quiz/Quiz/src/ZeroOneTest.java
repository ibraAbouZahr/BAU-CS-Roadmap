
public class ZeroOneTest {

	public static void main(String[] args) {
		
	    int profit[] = new int[] { 60, 100, 120 };
        int weight[] = new int[] { 10, 20, 30 };
        int W = 50;
        int n = profit.length;
        System.out.println(algo(W, weight, profit, n));

	}

	public static int algo(int W, int w[], int val[], int n) {
		if (W == 0 || n == 0) {
			return 0;
		}

		if (w[n - 1] > W) {
			return algo(W, w, val, n - 1);
		}

		else {
			return Math.max(algo(W, w, val, n - 1), val[n - 1] + algo(W - w[n - 1], w, val, n - 1));
		}
	}

}
