
public class Room {
	String roomNumber;
	String buildingName;
	int capacity;

	Room() {
		roomNumber = null;
		buildingName = null;
		capacity = 0;

	}

	Room(String roomNumber, String buildingName, int capacity) {
		this.roomNumber = roomNumber;
		this.buildingName = buildingName;
		this.capacity = capacity;
	}
	public void display() {
		System.out.println(" The room number is: " + roomNumber);
		System.out.println(" The building name is: " + buildingName);
		System.out.println(" The capacity is: " + capacity);
		
	}
}
