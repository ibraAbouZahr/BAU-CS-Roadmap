import java.util.*;
public class TestVehicle {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the name of vehicle 1:");
		String n = scan.next();
		System.out.println("Enter the id of vehicle 1:");
		String d = scan.next();
		System.out.println("Enter the weight of vehicle 1:");
		double w = scan.nextDouble();
		System.out.println();
		System.out.println("Enter the name of vehicle 2:");
		String n2 = scan.next();
		System.out.println("Enter the id of vehicle 2:");
		String d2 = scan.next();
		System.out.println("Enter the weight of vehicle 2:");
		double w2 = scan.nextDouble();
		
		Vehicle v1 = new Vehicle(n,d,w);
		Vehicle v2 = new Vehicle(n2,d2,w2);
		System.out.println("----Vehicle 1----");
		v1.display();
		System.out.println("----Vehicle 2----");
		v2.display();
		System.out.println();
		if (v1.checkweight() == true) {
			System.out.println("The weight of vehicle 1 is greater than 1400 Kg");
		}
		if (v2.checkweight() == true) {
			System.out.println("The weight of vehicle 2 is greater than 1400 Kg");
		}
	}

}
