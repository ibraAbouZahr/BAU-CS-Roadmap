import java.util.*;
public class Extra4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your full name: ");
		String name = scan.next();
		System.out.println("How old are you?");
		int age = scan.nextInt();
		if (age > 0); {
			System.out.println("Were you ever in the military (yes/no)?");}
		String answer = scan.next();
		System.out.println("How many years of experience do you have?");
		int years = scan.nextInt();
		System.out.println("Are you <m/>ale or <f/>emale?");
		char gender;
		gender = scan.next().charAt(0);
		if (age <= 30 && gender == 'm') {
			System.out.println("Dear " + name + " you may apply for the job!");}
		else if (age > 30 && gender == 'm');{
			if (years>= 12 || answer == "yes" ) {
				System.out.println("Dear " + name + "you may apply for the job!");}}
		if (age < 32 && gender == 'f') {
			System.out.println("Dear " + name + " you may apply for the job!");}
		else if (age > 32 && gender == 'f');{
		if (years>= 12 || answer == "yes") {
			System.out.println("Dear " + name + " you may apply for the job!");}
		else {
			System.out.print("Dear " + name + "you are not eligible!");
			
		}
			
		
		}
	}
}
			

	

			
			
		
			
			
			
			
		
		
		
	


