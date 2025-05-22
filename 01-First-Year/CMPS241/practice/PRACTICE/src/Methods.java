import java.util.*;
public class Methods {

	public static void main(String[] args) {
	Scanner scan = new Scanner (System.in);
	System.out.print("Enter first number: ");
	int n1 = scan.nextInt();
	System.out.print("Enter second number: ");
	int n2 = scan.nextInt();
	System.out.println("The smallest number is: " + min(n1, n2));
	System.out.println("The largest number is: " + max(n1, n2)); }
	
	
	
	public static int min(int n1, int n2) {
		int minimum = 0;
		
		if (n1 > n2) {
			 minimum = n2; }
		else {
			 minimum = n1; }
		return minimum; 
		
	
	}
	public static int max(int n1 , int n2) {
		int maximum = 0;
		
		if (n1 < n2) {
			 maximum = n2; }
		else {
			 maximum = n1; }
		return maximum; 
		
	}
		
		
		
		
	
		}
	










