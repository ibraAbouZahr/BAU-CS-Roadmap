import java.util.*;
public class Method2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter the number of elements: ");
		int e = scan.nextInt();
		int [] array = new int [e];
		System.out.println("Enter elements: ");
		for (int i = 0 ; i < array.length ; i++) {
			System.out.println("Element " + (i+1) + ":");
			array[i] = scan.nextInt();
			
			
		}
		System.out.println("The sum of all elements is: " + sum(array));
		System.out.println("The sum of positive numbers is: " + sumOfPositive(array));
		System.out.println("The sum of negative numbers is: " + sumOfNegative(array));
		

	}
	public static int sum(int array[]) {
		int sum = 0;
		for (int i = 0 ; i < array.length ; i++) {
			sum = sum + array[i];
		}
			return sum;
		}
	
	public static int sumOfPositive(int array[]) {
		int positive = 0;
		for (int i = 0 ; i < array.length ; i++) {
			if (array[i] > 0) {
				positive = positive + array [i];
			} 
				}
			return positive;
		}
	public static int sumOfNegative(int array[]) {
		int negative = 0;
		for (int i = 0 ; i < array.length ; i++) {
			if (array[i] < 0) {
				negative = negative + array [i];
			} 
				}
			return negative;
	
	
	}
}

