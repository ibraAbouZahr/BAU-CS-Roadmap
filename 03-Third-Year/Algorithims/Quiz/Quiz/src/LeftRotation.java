import java.util.ArrayList;
import java.util.List;

public class LeftRotation {

	public static void main(String[] args) {

		class Result {

			/*
			 * Complete the 'rotateLeft' function below.
			 *
			 * The function is expected to return an INTEGER_ARRAY. The function accepts
			 * following parameters: 1. INTEGER d 2. INTEGER_ARRAY arr
			 */
			public static List<Integer> rotateLeft(int d, List<Integer> arr) {
				int n = arr.size();
				// Handle cases where d > n
				d = d % n;

				// Create a new list to store the rotated result
				List<Integer> rotated = new ArrayList<>();

				// Add elements from index d to the end
				for (int i = d; i < n; i++) {
					rotated.add(arr.get(i));
				}

				// Add elements from the start to index d
				for (int i = 0; i < d; i++) {
					rotated.add(arr.get(i));
				}

				return rotated;
			}
		}

	}

}
