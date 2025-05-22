import java.util.*;
public class ExamExtra {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("The maximum room capacity is: ");
		int c = scan.nextInt();
		System.out.println("The number of people to attend is: ");
		int n = scan.nextInt();
		int ex = n -c;
		int spaces = c - n;
		if (n <= c) {
			System.out.println("It is legal to have the meeting! \nThe number of extra seats are " + spaces); }
		else {
			System.out.println("It is not legal to have the meeting ! \nThe number of people to be excluded is " + ex);
				
		}
	}

} 