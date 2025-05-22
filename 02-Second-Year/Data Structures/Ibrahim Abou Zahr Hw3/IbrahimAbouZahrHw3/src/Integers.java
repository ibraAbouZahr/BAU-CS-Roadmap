
public class Integers {

	public static int multiplication(int a, int b) {

		if (b == 1) {
			return a;
		} else {
			return a + multiplication(a, b - 1);
		}
	}

	public static int addition(int a, int b) {
		if (b == 0) {
			return a;
		} else {
			return addition(a + 1, b - 1);
		}
	}

	public static int subtraction(int a, int b) {
		if (b == 0) {
			return a;
		} else {
			return subtraction(a - 1, b - 1);
		}
	}

	public static void printForward(int n) {

		if (n < 10) {
			System.out.println(n);
		} else {
			printForward(n / 10);
		}

	}

	public static void printReverse(int n) {
		if (n < 10) {
			System.out.println(n);
		} else {
			System.out.println(n % 10);
			printReverse(n / 10);
		}

	}

	public static int gcd(int a, int b) {
		if (a == b) {
			return a;
		} else if (a > b) {

			return gcd(a - b, b);
		} else {
			return gcd(a, b - a);
		}
	}

}
