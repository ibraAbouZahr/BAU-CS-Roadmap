
public class Book {
	
	public String title;
	public String author;
	public int ISBN;
	public boolean isAvailabe;
	
	
	public Book(String title , String author, int ISBN, boolean isAvailable) {
		this.title = title;
		this.author = author;
		this.ISBN = ISBN;
		this.isAvailabe = isAvailable;
	}
	
	public void Availability() {
		if(isAvailabe == true) {
			System.out.println("Book is available");
		}
		System.out.println("Book is not available");
	}

}
