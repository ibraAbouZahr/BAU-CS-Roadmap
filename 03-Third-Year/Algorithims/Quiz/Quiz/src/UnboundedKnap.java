
public class UnboundedKnap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	static int knapSackRecur(int i, int capacity, int[] val, int[] wt) {
		if (i == val.length)
			return 0;

		// Consider current item only if
		// its weight is less than equal
		// to maximum weight.
		int take = 0;
		if (wt[i] <= capacity) {
			take = val[i] + knapSackRecur(i, capacity - wt[i], val, wt);
		}

		// Skip the current item
		int noTake = knapSackRecur(i + 1, capacity, val, wt);

		// Return maximum of the two.
		return Math.max(take, noTake);
	}

	static int knapSack(int capacity, int[] val, int[] wt) {
		return knapSackRecur(0, capacity, val, wt);
	}

}
