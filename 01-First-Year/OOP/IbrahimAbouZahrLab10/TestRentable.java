import java.util.*;
import java.util.ArrayList;

public class TestRentable {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("How many objects do you want to add to the list?");
		int e = scan.nextInt();
		ArrayList<Rentable> array = new ArrayList<Rentable>();
		System.out.println();
		for (int i = 0; i < e; i++) {
			System.out.println("Please enter your choice: 1 for truck, 2 for car, 3 for garage: ");
			int choice = scan.nextInt();
			if (choice == 1) {
				Truck t1 = new Truck();
				t1.readTruckDetails();
				// we added the new object to the array list of objects
				array.add(t1);
			} else if (choice == 2) {
				Car c1 = new Car();
				c1.readCarDetails();
				array.add(c1);

			} else if (choice == 3) {
				Garage g1 = new Garage();
				g1.readGarageDetails();
				array.add(g1);
			} else {
				System.out.println("Invalid input!");
			}

		}
		System.out.println();
		display(e, array);
		System.out.println("The car that has the highest rental price is: ");
		expensiveCar(e, array);
		System.out.println();
		System.out.println("The number of garages in the list: ");
		nbrOfGarages(e, array);

	}

	public static void display(int e, ArrayList<Rentable> array) {
		for (int i = 0; i < e; i++) {
			if (array.get(i) instanceof Car) {
				array.get(i).toString();
				System.out.println();
			} else if (array.get(i) instanceof Truck) {
				array.get(i).toString();
				System.out.println();
			} else if (array.get(i) instanceof Garage) {
				array.get(i).toString();
				System.out.println();
			}
		}
	}

	public static Car expensiveCar(int e, ArrayList<Rentable> array) {
		Car c = new Car();

		double max = 0;
		for (int i = 0; i < e; i++) {
			if (array.get(i) instanceof Car) {
				Car m = ((Car) array.get(i));
				if (m.monthlyRentalPrice() > max) {
					max = m.monthlyRentalPrice();
					c = m;

				}

			}
		}
		return c;
	}

	public static int nbrOfGarages(int e, ArrayList<Rentable> array) {
		int count = 0;
		for (int i = 0; i < e; i++) {
			if (array.get(i) instanceof Garage) {
				count++;
			}
		}
		return count;

	}
}
