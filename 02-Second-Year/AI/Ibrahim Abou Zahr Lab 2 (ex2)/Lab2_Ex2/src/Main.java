import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the number of rows: ");
		int rows = scan.nextInt();

		System.out.println("Enter the number of columns: ");
		int cols = scan.nextInt();

		System.out.println("Enter the dirtiness levels for the rooms: ");
		double a[][] = new double[rows][cols];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				a[i][j] = scan.nextDouble();
				// Read Matrix
			}
		}
		System.out.println("At what position do you want the agent to start in? ");

		System.out.println("x = ");
		int x = scan.nextInt();
		System.out.println("y = ");
		int y = scan.nextInt();
		Agent agent = new Agent(x, y);
		
		//Agent will move 10 times
		for(int i = 0; i < 10; i++) {
			agent.Move(rows, cols);
			agent.DisplayStatus();
			agent.Suck(a);
			agent.DisplayStatus();
			System.out.println();
			
		}
		//Print Matrix
		for(int i = 0 ; i < rows; i++) {
			for(int j = 0; j < cols; j++) {
				System.out.println(a[i][j]);
			}
		}
		System.out.println();

	}

}
