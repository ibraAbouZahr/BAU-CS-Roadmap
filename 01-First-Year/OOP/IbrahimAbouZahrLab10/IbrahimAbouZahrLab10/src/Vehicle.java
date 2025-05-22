import java.util.*;

public class Vehicle   {
	private String name;
	private int modelYear;
	private double price;
	private String color;
	
	
	public Vehicle() {
		name = null;
		modelYear = 0;
		price = 0.0;
		color = null;
		
	}


	public Vehicle(String name, int modelYear, double price, String color) {
		
		this.name = name;
		this.modelYear = modelYear;
		this.price = price;
		this.color = color;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getModelYear() {
		return modelYear;
	}


	public void setModelYear(int modelYear) {
		this.modelYear = modelYear;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	
	public String toString() {
		return "Vehicle name=" + name + ", modelYear=" + modelYear + ", price=" + price + ", color=" + color ;
	}
	public void readVehicledetails() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the name:  ");
		String name = scan.next();
		System.out.println("Enter the model year: ");
		int modelYear = scan.nextInt();
		System.out.println("Enter the price: ");
		double price = scan.nextDouble();
		System.out.println("Enter the color: ");
		String color = scan.next();
	}
	
	
	
	

}
