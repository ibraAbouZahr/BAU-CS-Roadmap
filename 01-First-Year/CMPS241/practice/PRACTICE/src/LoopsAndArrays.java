import java.util.*;
public class LoopsAndArrays {

	public static void main(String[] args) {
	Scanner scan = new Scanner (System.in);
	boolean flag = false;
	System.out.println("Enter the size of array: ");
	int s = scan.nextInt();
	int [] array = new int [s];
	for (int i = 0 ; i < array.length ; i++) {
		System.out.println("Enter Element ["+ (i+1) +"] = ");
		array [i]= scan.nextInt();
	}
	System.out.println("What is the number you want to search for?");
	int search = scan.nextInt();
	
	for (int i = 0 ; i < array.length ; i++) {
		if (array[i] == search) {
			System.out.println("the number is on index " + i);
			flag = true;
			break;
			
			
		} 
	}
		if (!flag) {
			System.out.println("Number "+ search+ " is not found");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		}
	
	
	
	
	
	
	
	
	
	
	
	
		
	
	
		
	
	
	
	
	
		
	
	


	
