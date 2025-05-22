import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int[] arr = new int[9];
	System.out.println("Enter array elements: ");
	for(int i = 0; i < arr.length ; i++) {
		arr[i] = scan.nextInt();
		
	
	    }
	System.out.println("Input array: ");
	for(int i = 0; i < arr.length; i++) {
		System.out.println(arr[i]);
	}
	System.out.println("Output array: ");
	ReverseOddElements(arr);
	for(int i = 0; i < arr.length; i++) {
		System.out.println(arr[i]);
	}
	}

	public static void ReverseOddElements(int arr[]) {
		int count = 0;
		int[]odd = new int[count];
		for(int i = 0; i < arr.length ; i++) {
			if(arr[i] %2 == 1) {
				count++;
				odd[i] = arr[i];
			}
		}
		int temp;
		for(int i = 0; i < odd.length/2 ; i++) {
			temp = odd[i];
			odd[i] = odd[count-1-i];
			odd[count-1-i] = temp;
			
		}
		for(int i = 0; i < arr.length ; i++) {
			if(arr[i] %2 == 1) {
				arr[i] = odd[i]; 
		
	}
}
	}
}