import java.util.*;
public class Practice1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter 10 numbers:");
			int [] array =  new int [10];
			for (int i = 0 ; i < 10; i++) {
				array [i] = scan.nextInt();
			}
			int sum = 0;
			for (int i = 0; i < array.length; i++) {
				sum = sum + array[i];
				
			}
			System.out.println(sum);
			double average = sum/10.0;
			System.out.println(average);
			
			
		
		}
	}


