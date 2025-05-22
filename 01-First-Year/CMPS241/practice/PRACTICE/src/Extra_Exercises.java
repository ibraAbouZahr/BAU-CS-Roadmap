import java.util.*;
public class Extra_Exercises {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your monthly internet usage: ");
		double i = scan.nextDouble();
		if (i <= 50) {
			System.out.println("The recommended bundle is the " + 50+"G"+ ", it costs "+ 20+"$");}
		else if ( i >= 50 && i <=60) {
			System.out.println("The recommended bundle is the " + 60+"G"+ ", it costs "+ 25+"$");}
		else if ( i>= 60 && i<=100) {
			System.out.println("The recommended bundle is the " + 100+"G"+ ", it costs "+ 40+"$");}
		else if ( i>100 && i <= 200) {
			System.out.println("The recommended bundle is the " + 200+"G"+ ", it costs "+ 80+"$");}
		else {
			System.out.println("The recommended bundle is the unlimited it costs "+ 100+"$");}
			
		}
		

	}


