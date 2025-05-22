import java.util.ArrayList;
public class Book {
	private int ID;
	private String name;
	private int nbrOfPages;
	private String genre;
	private double price;
	private static int nbrOfBooks;
	private ArrayList<String>authors;

	
	public Book(String name, int nbrOfPages, String genre, double price) {
		this.name = name;
		this.nbrOfPages = nbrOfPages;
		this.genre = genre;
		this.price = price;
		authors = new ArrayList<String>();
		nbrOfBooks++;
		ID = nbrOfBooks;
	}


	public String getName() {
		return name;
	}


	

	public String getGenre() {
		return genre;
	}


	

	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}
	public void addAuthor(String author) {
		authors.add(author);
	}
	public boolean removeAuthor(String author) {
		return authors.remove(author);
	}
	public boolean checkAuthor(String author) {
		return authors.contains(author);
	}


	
	public String toString() {
		return "Book "+ ID + "/n name:" + name + "/n nbrOfPages:" + nbrOfPages + "/n genre:" + genre + "/n price:"
				+ price + "/n authors:" + authors;
	}
	
	
}
