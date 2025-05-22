
public class Vehicle {
	private String name;
	private String id;

	
	
	public Vehicle() {
		name = null;
		id = null;
	}
	public Vehicle(String n, String d) {
		this.name = n;
		this.id= d;
		
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void display() {
		System.out.println("Name: " + name + " id: " + id);
		
	}
	
	
}
