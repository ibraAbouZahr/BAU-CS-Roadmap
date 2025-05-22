import java.util.*;
public class LabExtra2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("How much is the bill? ");
		int b = scan.nextInt();
		if (b <= 50) {
			System.out.println("The tax value is 10% \n Total bill is " + (b*0.1 + b)); }
		else if (b <100 && b > 50) {
			System.out.println("The tax value is 12% \n Total bill is " + (b*0.12 + b)); }
		else  
			System.out.println("The tax value is 15% \n Total bill is " + (b*0.15 + b)); }
			
		
		
			}
		
		
		


	


