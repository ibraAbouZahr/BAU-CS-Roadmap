import java.util.*;
public class TestGymSubs {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("What is the number of subscribers you want to add? ");
		int numSubs = scan.nextInt();
		
		GymSubs d1 = new GymSubs();
		
		d1.addSubscriber("ibra", "74872823", "202300976", "Male");
		d1.addSubscriber("Ali", "78473989", "20227488", "Male");
		d1.addSubscriber("Sama", "768492020", "20234893", "Female");
		System.out.println("What name do you want to search for? ");
		String nameSearch = scan.next();
		d1.searchByName(nameSearch);
		System.out.println("What ID do you want to search for? ");
		String IDsearch = scan.next();
		d1.printSubscriberList();

	}

}
