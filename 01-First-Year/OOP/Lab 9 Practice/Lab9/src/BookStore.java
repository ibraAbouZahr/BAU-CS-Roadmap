
public class BookStore {
	private String name;
	private Book[] books;
	private int nbrOfBooks;

	public BookStore(String name, Book[] books, int nbrOfBooks) {
		super();
		this.name = name;
		this.books = books;
		this.nbrOfBooks = nbrOfBooks;
	}
	public boolean addBook(Book book) {
		if (nbrOfBooks < 200) {
			books[nbrOfBooks] = book;
			nbrOfBooks++;
			return true;
		}
		return false;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNbrOfBooks() {
		return nbrOfBooks;
	}
	public boolean removeAuthorFromBook(String book, String author) {
		for(int i = 0; i < nbrOfBooks ; i++) {
			if(books[i].getName().equals(book) && books[i].removeAuthor(author)) {
				System.out.println("The author " + author + " is successfully removed from the book " + book);
				return true;
			}
		}
		return false;
	}

}
