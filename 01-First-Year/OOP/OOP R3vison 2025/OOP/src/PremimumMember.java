
public class PremimumMember extends Member {

	private int rewardPoints;

	public PremimumMember(String name, int memberId) {
		super(name, memberId);
		this.rewardPoints = 0;

	}

	public void earnRewardPoints(int points) {
		this.rewardPoints += points;
		System.out.println(super.getName() + " earned " + points + " reward points. Total: " + rewardPoints);
	}

	@Override
	public void borrowbook(Book book) {
		super.borrowbook(book);
		if(!book.isAvailabe) {
			System.out.println("Premium perk: Reserved " + book.title + " for next availability.");
		}
		
		else {
			earnRewardPoints(10);
		}

	}

}
