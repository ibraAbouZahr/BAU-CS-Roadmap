import java.util.*;

public class Garage implements Rentable {
	private String name;
	private double area;
	private double price;
	private String location;

	public Garage() {
		name = null;
		area = 0.0;
		price = 0.0;
		location = null;
		
	}
	public Garage(String name, double area, double price, String location) {
		this.name = name;
		this.area = area;
		this.price = price;
		this.location = location;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	public String toString() {
		return " name=" + name + ", area=" + area + ", price=" + price + ", location=" + location;
	}
	public void readGarageDetails() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Garage name: ");
		String name = scan.next();
		System.out.println("Enter the area of the garage: ");
		double area = scan.nextDouble();
		System.out.println("Enter the location: ");
		String location = scan.next();
		System.out.println("Enter the price: ");
		double price = scan.nextDouble();
		
	}
	
	public double monthlyRentalPrice() {
		double prop = price*0.1;
		return prop;
	}
	
}
