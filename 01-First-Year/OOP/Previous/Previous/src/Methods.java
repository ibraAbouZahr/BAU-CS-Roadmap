import java.util.*;

public class Methods {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] array = new int[5];

	}

	public boolean isEmpty(int[] array) {

		if (array.length == 0)
			return true;

		else
			return false;

	}

	public boolean isFull(int[] array) {
		if (array.length == 5) {
			return true;
		} else
			return false;
	}

	public void InsertElement(int[] array, int v, int i) {
		if (isFull(array) == true) {
			i = 2;
			array[i] = v;
		} else {
			System.out.println("array is empty");
		}

	}

	public int SearchValue(int[] array, int v) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number you want to search for: ");
		v = scan.nextInt();
		for (int i = 0; i < array.length; i++) {
			if (array[i] == v)
				return array[i];

			else
				return -1;

		}
		return 0;
	}

	public boolean DeleteElement(int[] array, int v) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number you want to delete : ");
		v = scan.nextInt();
		for (int i = 0; i < array.length; i++) {
			if (array[i] == v)
				array[i] = 0;

		}
		return false;

	}

	public int OccurrenceNb(int[] array, int v) {
		int count = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number you want to know the number of appearances for : ");
		v = scan.nextInt();
		for (int i = 0; i < array.length; i++) {
			if (array[i] == v)
				count++;
		}
		return count;

	}

	public static boolean Palindrome(int[] array) {
		for (int i = 0; i < array.length / 2; i++) {
			int j = array.length - i - 1;
			if (array[i] != array[j]) {
				return false; 
			}
		}
		return true;
	}

	public void dsiplay(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

	}

	public int OddNb(int[] array) {
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 != 0)
				count++;

		}
		return count;
	}

	public int EvenNb(int[] array) {
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {
				count++;
			}
		}
		return count;

	}

	public boolean EvenOrOdd(int[] array) {
		int countEven = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {
				countEven++;
			}
		}
		int countOdd = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 != 0)
				countOdd++;
		}
		if (countEven > countOdd) {
			return true;
		}

		return false;
	}

	public void insertAtFront(int[] array, int v) {
		int[] array1 = new int[array.length + 1];
		array1[0] = v;
		for (int i = 0; i < array1.length; i++) {
			array1[i] = array[i - 1];

		}

	}

	public void deleteFromBack(int[] array) {
		int[] array1 = new int[array.length - 1];
		for (int i = 0; i < array1.length; i++) {
			array1[i] = array[i];
		}
		System.out.println(array1);
	}

}
