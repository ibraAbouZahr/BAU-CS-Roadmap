import java.util.*;
public class Ex3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter the sequence of characters (! to end): ");
		char ch = scan.next().charAt(0);
		int count = 0;
		int nbofChar =0;
		while (ch != '!') {
			if (ch == 'o' || ch == 'a' || ch == 'e' || ch == 'u' || ch == 'i') 
			count++;
			
			ch = scan.next().charAt(0);
			nbofChar++;
		}
	System.out.println("the number of vowels is: " + count);		
	}

}
