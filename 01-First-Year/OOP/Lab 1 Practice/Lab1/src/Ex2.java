import java.util.*;
public class Ex2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a value ");
	
		int x = scanner.nextInt();
		for (int i = 1 ; i <= x ; i++) {
			for (int j = i ; j >= 1 ; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
}
}
