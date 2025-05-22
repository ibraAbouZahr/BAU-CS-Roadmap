
public class LinkedList {
	public Node first;
	private String name;

	public LinkedList() {
		first = null;
		name = null;
	}

	public LinkedList(String s) {
		name = s;
		first = null;
	}

	public boolean isEmpty() {
		if (first == null) {
			return true;
		}
		return false;

	}

	public void insertAtFront(int a) {
		Node n = new Node(a);

		if (isEmpty()) {
			first = n;
		} else {
			n.next = first;
			first = n;
		}
	}

	public int deleteFromFront() {
		if (isEmpty()) {
			return -1;
		}

		int dataDeleted = first.data;
		first = first.next;
		return dataDeleted;
	}

	public void display() {
		Node current = first;

		while (current != null) {
			System.out.println(current.data);
			current = current.next;
		}
	}

}
