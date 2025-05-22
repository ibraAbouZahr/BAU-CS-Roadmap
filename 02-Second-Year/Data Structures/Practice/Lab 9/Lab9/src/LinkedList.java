
public class LinkedList {

	public Node first;
	private String name;

	public LinkedList() {
		first = null;
		name = "";
	}

	public LinkedList(String name) {
		this.name = name;
		first = null;
	}

	public boolean isEmpty() {
		return (first == null);
	}

	public void insertAtFront(int d) {
		Node p = new Node(d);
		if (isEmpty()) {
			first = p;
		} else {
			p.next = first;
			first = p;
		}
	}

	public int deleteFromFront() {
		int temp = -1;
		if (!isEmpty()) {
			temp = first.data;
			first = first.next;
		}
		return temp;
	}

	public void insertAtBack(int a) {

		if (isEmpty()) {
			first = new Node(a);

		} else {
			Node p = new Node(a);
			Node current = first;
			while (current.next != null) {
				current = current.next;
			}
			current.next = p;
			p.next = null;
		}
	}

	public boolean display() {
		if (isEmpty()) {
			return false;
		}
		Node current = first;
		while (current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
		return true;
	}
}
