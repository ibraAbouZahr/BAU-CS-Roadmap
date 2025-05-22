import java.util.*;

public class Ex2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s = scan.next();
		reverseStr(s);
	}

	public static void reverseStr(String s) {
		for (int i = s.length() - 1 ; i >= 0; i--) {
			System.out.print(s.charAt(i));
		}

	}
}
