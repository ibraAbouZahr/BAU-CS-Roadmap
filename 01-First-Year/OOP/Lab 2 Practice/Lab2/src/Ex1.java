import java.util.*;
public class Ex1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter a string: ");
		String s = scan.next();
		int count = 0;
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == 'a') {
				count++;
			}
			
		}
		System.out.println("The letter a appears " + count + " times");
	


	}

}
