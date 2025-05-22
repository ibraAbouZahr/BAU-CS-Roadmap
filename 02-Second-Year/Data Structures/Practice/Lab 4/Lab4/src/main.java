import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		LinkedList MyList = new LinkedList();
		int e;

		System.out.println("How many elements do you want to insert at front?");
		e = scan.nextInt();
		System.out.println("Enter " + e + " elements:");
		int x;
		for(int i = 0; i < e; i++) {
			x = scan.nextInt();
			MyList.insertAtFront(x);
			
		}
		System.out.println("How many elements do u want to insert at back:");
		int b = scan.nextInt();
		System.out.println("Enter the " + b + " elements:");
		for(int i = 0; i < b; i++) {
			int t = scan.nextInt();
			MyList.insertAtBack(t);
	}
		
		MyList.display();

}
}
