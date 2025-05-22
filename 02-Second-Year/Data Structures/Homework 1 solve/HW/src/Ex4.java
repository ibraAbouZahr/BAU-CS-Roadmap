import java.util.Scanner;

public class Ex4 {

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

	}
	public static void SwapSecddMinSecdMax(int arr[])
	{
		int max = 0;
		int min = 0;
		int secondMax = 0;
		int secondMin = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[max] < arr[i]) {
				max = i;
			} else if (arr[i] < arr[min]) {
				min = i;
			}
			if(arr[secondMax] < arr[max] && arr[secondMax] > arr[i] ) {
				secondMax = i;
			}
			else if(arr[min] < arr[secondMin] && arr[secondMin] < arr[i] ) {
				secondMin = i;
			}
		}
		int temp;
		temp = arr[secondMin];
		arr[secondMin] = arr[secondMax];
		arr[secondMax] = temp;
	
	}

}
