import java.util.*;
public class Final_Lab_Sample {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("What is the number of elements you want to enter into the array?");
		int e = scan.nextInt();
		boolean flag = false;
		int [] array = new int [e];
		int product = 1;
		for (int i = 0; i < e  ; i++) {
			System.out.println("Enter element [" + (i+1) + "] =" );
			 array [i] = scan.nextInt(); }
			 for (int j = 0; j < array.length; j++) {
				 if(array[j] > 0) {
					 product = product*array[j];
					 flag = true;
				 }
				
			}
		
if(flag == true) {
	System.out.println("the product of positive numbers is:" + product);
	if (product %5==0) {
		System.out.println(product + "is divisible by 5"); }
	else {
		System.out.println("not divisible");
	}
	
}
else {
	System.out.println("all negative");
}
	}

}
