
public class Node {
	private Song song;
	private Node Next;

	public Node() {
		song = null;
		Next = null;
	}

	public Node(Song song) {
		this.song = song;
		Next = null;
	}

	public Song getSong() {
		return song;
	}

	public Node getNext() {
		return Next;
	}

	public void setNext(Node next) {
		Next = next;
	}

}
