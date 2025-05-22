import java.util.*;
interface Rentable {
	public double monthlyRentalPrice();
}

public class Car extends Vehicle implements Rentable {
	private int nbrOfSeats;
	
	public Car() {
		super();
		nbrOfSeats = 0;
	}

	public Car(String name , int modelYear ,double price, String color, int nbrOfSeats) {
		super(name,modelYear,price,color);
		this.nbrOfSeats = nbrOfSeats;
	}

	public int getNbrOfSeats() {
		return nbrOfSeats;
	}

	public void setNbrOfSeats(int nbrOfSeats) {
		this.nbrOfSeats = nbrOfSeats;
	}

	
	public String toString() {
		return super.toString() +" [nbrOfSeats=" + nbrOfSeats + "]";
	}
	
	public void readCarDetails() {
		Scanner scan = new Scanner(System.in);
		super.readVehicledetails();
		System.out.println("Enter the number of seats: ");
		int nbrOfSeats = scan.nextInt();
		
	}
	public double monthlyRentalPrice() {
		double prop = super.getPrice()*0.1;
		return prop;
	}
	

}
