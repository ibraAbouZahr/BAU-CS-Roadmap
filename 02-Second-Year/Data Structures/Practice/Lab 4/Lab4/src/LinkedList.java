
public class LinkedList {
	private Node head;

	public LinkedList() {
		head = null;
	}

	public boolean isEmpty() {
		if (head == null) {
			return true;
		}
		return false;
	}

	public void insertAtFront(int x) {
		Node n = new Node(x);
		if (isEmpty()) {
			head = n;
		}
		n.next = head;
		head = n;

	}

	public void display() {
	
		Node current = head;
		while (current != null) {
			System.out.println(current.data + " --> ");
			current = current.next;
		}
		System.out.println("null");
	}

	public void insertAtBack(int x) {
		Node n = new Node(x);
		if (isEmpty()) {
			head = n;
			n.next = null;
		}
		else {
			
			Node current = head;
			while (current != null) {
				current = current.next;
			}
			current.next = n;
		}

	}

	public void deleteFromFront() {
		if (isEmpty()) {
			System.out.println("Nothing to delete");
		}
		head = head.next;
	}

	public void deleteFromBack() {
		if (isEmpty()) {
			System.out.println("Nothing to delete");
		}
		Node current = head;
		Node prev = head;
		while (current != null) {
			prev = current;
			current = current.next;

		}
		prev.next = null;
	}

	public int occurenceNb(int x) {
		Node current = head;
		int count = 0;

		while (current != null) {
			if (current.data == x) {
				count++;
			}
			current = current.next;
		}
		return count;
	}

	public int OddNb() {
		Node current = head;
		int count = 0;

		while (current != null) {

			if (current.data % 2 != 0) {
				count++;
			}
			current = current.next;
		}
		return count;
	}

	public LinkedList AddTwoLists(LinkedList list) {
		LinkedList sum = new LinkedList();
		if (list.isEmpty()) {
			return this;
		} else if (this.isEmpty()) {
			return list;
		} else {
			Node current = head;
			Node current2 = list.head;

			while (current != null) {
				if (current2 != null) {
					sum.insertAtBack(current.data + current2.data);
					current2 = current2.next;
				} else {
					sum.insertAtBack(current.data);

					current = current.next;
				}
			}
			while (current2 != null) {
				sum.insertAtBack(current2.data);

				current2 = current2.next;
			}
			return sum;

		}
	}

}
