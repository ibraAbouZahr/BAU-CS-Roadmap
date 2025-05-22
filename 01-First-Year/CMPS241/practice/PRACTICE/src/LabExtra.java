import java.util.*;
public class LabExtra {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("How many children do you have? ");
		int n = scan.nextInt();
		int salary = 600;
		switch (n) {
		case 0:
			System.out.println("The total salary is " + salary + "$");
			break;
		case 1:
			System.out.println("The total salary is " + (salary + 60 + "$"));
			break;
		case 2:
		case 3:
			System.out.println("The total salary is " + (salary + 120 + "$"));
			break;
		case 4:
		case 5:
			System.out.println("The total salary is " + (salary + 200)+ "$");
			break;
		default:
			System.out.println("The total salary is " + (salary + 300) + "$");
			
		}
	}

}
