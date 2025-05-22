
public class Ex3 {
	public double[] averageofEach3Elements(int a[]) {
		double[] averageA = new double[a.length - 2];
		for (int i = 0; i < a.length - 2; i++) {
			double avg = (a[i] + a[i + 1] + a[i + 2]) / 3.0;

			averageA[i] = avg;

		}
		return averageA;
	}
	// Time Complexity: N + 1 +1 = O(N);
}
