
public class TestRoom {

	public static void main(String[] args) {
		Room r1 = new Room("EB218" , "Engineering", 60);
		Room r2 = new Room("B210" , "Science", 35);
		Room r3 = new Room("B309" , "Science", 40);
		System.out.println("----Room1----");
		r1.display();
		System.out.println("----Room2----");
		r2.display();
		System.out.println("----Room3----");
		r3.display();
		
	}

}
