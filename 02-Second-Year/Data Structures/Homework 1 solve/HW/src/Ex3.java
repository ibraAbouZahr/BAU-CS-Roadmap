import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[9];
		System.out.println("Enter array elements: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();

		}
		System.out.println("Input array: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("Output array: ");
		SwapMinMax(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

	public static void SwapMinMax(int arr[]) {
		int max = 0;
		int min = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[max] < arr[i]) {
				max = i;
			} else if (arr[i] < arr[min]) {
				min = i;
			}
		}
		int temp;
		temp = arr[min];
		arr[min] = arr[max];
		arr[max] = temp;
	}

}
