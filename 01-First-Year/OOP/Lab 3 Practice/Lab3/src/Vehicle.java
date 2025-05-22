import java.util.*;
public class Vehicle {
	String name;
	String id;
	double weight;

	Vehicle() {
		name = null;
		id = null;
		weight = 0.0;
	}

	Vehicle(String name, String id, double weight) {
		this.name = name;
		this.id = id;
		this.weight = weight;

	}
	public void display () {
		System.out.println("The name is: "+ name);
		System.out.println("The ID is: " + id);
		System.out.println("The weight is: " + weight);
	}
	
public void insertVehicle(String n , String d , double w) {
	name = n;
	id = d;
	weight = w;
}
public boolean checkweight() {
	if (weight > 1400) {
		return true;
	}
	else {
		return false;
	}
}
}
