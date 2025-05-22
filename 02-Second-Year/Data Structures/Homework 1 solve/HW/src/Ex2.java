import java.util.Scanner;

public class Ex2 {

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
		StoreLeftRight(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

	public static void StoreLeftRight(int arr[]) {
		int OddCount = 0;
		int EvenCount = 0;
		int[] odd = new int[OddCount];
		int[] even = new int[EvenCount];
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]%2 == 0) {
				EvenCount++;
				even [i] = arr[i];
			}
			else if(arr[i]%2 == 1) {
				OddCount++;
				odd [i] = arr[i];
			}

		}
		int temp;
		for(int i = 0; i < OddCount; i++) {
			temp = odd[i];
			odd[i] = arr[i];
			arr[i] = temp;
		}
		int temp2;
		for(int i = OddCount; i < arr.length; i++) {
			temp2 = even[i];
			even[i] = arr[i];
			arr[i] = temp2;
		}
	}

}
