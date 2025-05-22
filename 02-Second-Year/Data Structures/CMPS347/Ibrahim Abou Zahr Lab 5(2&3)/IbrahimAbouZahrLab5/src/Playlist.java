
public class Playlist {
	private Node head;
	private Node tail;
	private int size;

	public Playlist() {
		head = null;
		tail = null;
		size = 0;

	}

	public boolean isEmpty() {
		if (head == null) {
			return true;
		}
		return false;
	}

	public void clear() {
		if(isEmpty()) {
			System.out.println("The playlist is clear! ");
		}
		else {
			head = null;
			tail = null;
		}

	}
	public void play() {
		if(isEmpty())  {
			System.out.println("No songs in the playlist. ");
		}
		Node current = head;
		while(current!= null) {
			Song s1 = current.getSong();
			System.out.println("Title: " + s1.getTitle());
			System.out.println("Title: " + s1.getArtist());
			current = current.next;
		}
	}
	public void addSong(Song song) {
		
	}
	

}
