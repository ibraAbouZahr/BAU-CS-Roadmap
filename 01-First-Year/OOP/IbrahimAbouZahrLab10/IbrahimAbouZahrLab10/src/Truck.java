import java.util.*;

public class Truck extends Vehicle implements Rentable {
	private double load;

	public Truck() {
		super();
		load = 0.0;
	}

	public Truck(String name, int modelYear, double price, String color, double load) {
		super(name, modelYear, price, color);
		this.load = load;
	}

	public double getLoad() {
		return load;
	}

	public void setLoad(double load) {
		this.load = load;
	}

	
	public String toString() {
		return super.toString() + " load=" + load ;
	}
	public void readTruckDetails() {
		Scanner scan = new Scanner(System.in);
		super.readVehicledetails();
		System.out.println("Enter the truck load capacity: ");
		double load = scan.nextDouble();
	}

	
	public double monthlyRentalPrice() {
		double prop = super.getPrice()*0.1;
		return prop;
	}
	

}
