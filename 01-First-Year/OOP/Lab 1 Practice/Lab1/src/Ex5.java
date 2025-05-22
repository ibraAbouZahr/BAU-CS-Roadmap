import java.util.*;
public class Ex5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int [] array = new int[4];
		System.out.println("Enter the elements of the first vector "); 
		for (int i = 0 ; i < array.length ; i++) {
			array[i] = scan.nextInt();
		}
		
		int [] array2 = new int[4];
		System.out.println("Enter the elements of the second vector "); 
		int product = 1;
		for (int i = 0 ; i < array.length ; i++) {
			array2[i] = scan.nextInt();
			product += array [i] * array2[i];
		}
		System.out.println("The dot product of the two arrays is: " + product);
	}

}
