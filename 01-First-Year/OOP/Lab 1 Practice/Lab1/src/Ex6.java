import java.util.*;
public class Ex6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter the size of the array");
		int e = scan.nextInt();
		int [] array = new int[e];
		
		System.out.println("Enter the elements of the array: ");
		for (int i = 0 ; i < e ; i++) {
			array [i] = scan.nextInt();
		}
		int min = array[0];
		for (int i = 0 ; i < e ; i++) {
			if (min > array[i]) 
				min = array[i];
			
		}
		System.out.println("The smallest element is: " + min);
	}

}
