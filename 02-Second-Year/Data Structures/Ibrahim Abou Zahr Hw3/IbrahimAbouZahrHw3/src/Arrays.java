
public class Arrays {

	public static int printArrayForward(int a[], int n) {
		if (n == a.length) {
			return 0;
		} else {
			System.out.println(a[n]);
			return printArrayForward(a, n + 1);
		}
	}

	public static int printArrayReverse(int a[], int n) {
		if (n == a.length) {
			return 0;
		} else {
			System.out.println(a[a.length]);
			return printArrayForward(a, n - 1);
		}
	}

	public static int sumArray(int a[], int n) {
		if (n == 0) {
			return 0;
		} else {
			return a[n] + sumArray(a, n - 1);
		}
	}

	public static int sumOfOddElementArray(int a[], int n) {
		if (n == 0) {
			return 0;
		} else if (n % 2 != 0) {

			return a[n] + sumOfOddElementArray(a, n - 1);
		}

		else {
			return sumOfOddElementArray(a, n - 1);
		}
	}

	public static int sumOfEvenElementArray(int a[], int n) {
		if (n == 0) {
			return 0;
		} else if (n % 2 == 0) {

			return a[n] + sumOfOddElementArray(a, n - 1);
		}

		else {
			return sumOfEvenElementArray(a, n - 1);
		}
	}

	public static int averageArray(int a[], int n) {
		if (n == 0) {
			return 0;
		} else {
			return (a[n] + averageArray(a, n - 1)) / a.length;
		}

	}

	public static int binarySearch(int a[], int first, int last, int element) {
		if (first <= last) {
			int mid = (first + last) / 2;

			if (a[mid] == element) {
				return mid;
			}
			if (a[mid] > element) {
				return binarySearch(a, first, mid - 1, element);
			} else {
				return binarySearch(a, first, mid + 1, element);
			}
		}
		return -1;
	}

	public static int minimumArray(int a[], int n) {
		int Min = a[0];
		if(n == a.length) {
			return Min;
		}
		else if(Min > a[n]) {
			a[n] = Min;
			return minimumArray(a, n -1);
		}
		return -1;

	}
	public static int MaximumArray(int a[], int n) {
		int Max = a[0];
		if(n == a.length) {
			return Max;
		}
		else if(Max < a[n]) {
			a[n] = Max;
			return MaximumArray(a, n -1);
		}
		return -1;

	}
}
