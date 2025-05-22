
public class UnboundedTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static int algo(int i, int capacity, int val[], int wt[]) {
		if (i == val.length) {
			return 0;
		}
		int take = 0;
		if (wt[i] <= capacity) {
			take = val[i] + algo(i, capacity - wt[i], val, wt);
		}
		int noTake = algo(i + 1, capacity, val, wt);

		return Math.max(take, noTake);
	}

	public static int cont(int capacity, int val[], int wt[]) {
		return algo(0, capacity, val, wt);
	}

}
