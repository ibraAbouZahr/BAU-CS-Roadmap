import java.util.ArrayList;
import java.util.List;

public class Member {

	private String name;
	private int memberID;
	private List<Book> borrowedBooks;

	public Member(String name, int member_ID) {
		this.name = name;
		this.memberID = memberID;
		this.borrowedBooks = new ArrayList<>();

	}

	public void borrowbook(Book book) {

		if (book.isAvailabe) {
			borrowedBooks.add(book);
			book.isAvailabe = false;
			System.out.println("borrowed: " + book.title);
		} else {
			System.out.println("Book " + book.title + " is not available. ");
		}

	}

	public void returnBook(Book book) {
		if (borrowedBooks.contains(book)) {
			borrowedBooks.remove(book);
			book.isAvailabe = true;
		} else {
			System.out.println("This book is not for us");
		}
	}

	public String getName() {
		return name;
	}

	public List<Book> getBorrowedBooks() {
		return borrowedBooks;
	}
}
