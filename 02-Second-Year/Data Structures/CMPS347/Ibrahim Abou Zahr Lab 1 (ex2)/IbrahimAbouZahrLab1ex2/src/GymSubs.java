
public class GymSubs {
	public String name;
	public String phoneNumber;
	public String IDcard;
	public String gender;
	public GymSubs[] subscriber;
	public int maxSubs = 50;
	public int numSubs;

	public GymSubs() {
		name = null;
		phoneNumber = null;
		IDcard = null;
		gender = null;
		subscriber = new GymSubs[maxSubs];

	}

	public GymSubs(String name, String phoneNumber, String iDcard, String gender) {

		this.name = name;
		this.phoneNumber = phoneNumber;
		this.IDcard = iDcard;
		this.gender = gender;
		this.subscriber = new GymSubs[maxSubs];
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getIDcard() {
		return IDcard;
	}

	public void setIDcard(String iDcard) {
		IDcard = iDcard;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void addSubscriber(String name, String phoneNumber, String IDcard, String gender) {
		if (numSubs < maxSubs) {
			subscriber[numSubs] = new GymSubs(name, phoneNumber, IDcard, gender);
			numSubs++;
			System.out.println("Subscriber added!");
		} else {
			System.out.println("Max capacity reached!");
		}

	}

	public void searchByName(String name) {
		for (int i = 0; i < subscriber.length; i++) {
			if (subscriber[i].getName().equals(name)) {
				System.out.println(subscriber[i]);
			} else {
				System.out.println("There is no entry with that name!");
			}
		}
	}

	public void searchByIdCard(String IDcard) {
		for (int i = 0; i < subscriber.length; i++) {
			if (subscriber[i].getIDcard().equals(IDcard)) {
				System.out.println(subscriber[i]);
			} else {
				System.out.println("No entry with this ID!");
			}
		}
	}

	public void printSubscriberList() {
		for (int i = 0; i < subscriber.length; i++) {
			System.out.println(subscriber[i]);
		}
	}
}
