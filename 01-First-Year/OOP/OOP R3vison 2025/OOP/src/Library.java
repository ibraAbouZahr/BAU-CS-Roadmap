import java.util.*;

public class Library {

	private String name;
	private List<Book> books;
	private List<Member> members;

	public Library(String name) {
		this.name = name;
		
		this.books = new ArrayList<>();
		this.members = new ArrayList<>();

	}
	
	public void addBook(Book book) {
		books.add(book);
		System.out.println("Add book: " + book.title);
	}
	
	public void registerMember(Member member) {
		members.add(member);
		System.out.println("Memeber added: " + member.getName());
	}

}
