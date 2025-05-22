import java.util.Scanner;
public class Switch {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("How many children does the employee have?");
		int c = scan.nextInt();
		int basic = 600;
		switch (c) {
		case 1: 
			System.out.println("The total salary is: " + (basic+60) + "$");
			break;
		case 2:
		case 3:
			System.out.println("The total salary is: " + (basic + 120)+ "$");
			break;
		case 4:	
		case 5:
			System.out.println("The total salary is: "+(basic + 200)+ "$");
			break;
		default:
			System.out.println("The total salary is: " + (basic + 300)+ "$");
			
		}
	}

}
