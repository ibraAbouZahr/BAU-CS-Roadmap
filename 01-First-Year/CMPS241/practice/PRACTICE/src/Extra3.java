import java.util.*;
public class Extra3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 1 for First Class, 2 for Business Class, 3 for Economic Class: ");
		int payment = scan.nextInt();
		switch (payment) {
		case 1: System.out.println("The First Class ticket costs 1000$");
		break;
		case 2: System.out.println("The Business ticket costs 800$");
		break;
		case 3 :System.out.println("The Economic ticket costs 500$");
		break;
		default: System.out.println("You entered a wrong number. You should enter either 1 or 2 or 3.");
		}

	}

}
