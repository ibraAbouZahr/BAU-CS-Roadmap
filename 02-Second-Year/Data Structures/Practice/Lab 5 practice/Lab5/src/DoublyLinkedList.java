
public class DoublyLinkedList {
	Node head;
	Node tail;

	public DoublyLinkedList() {
		head = null;
		tail = null;
	}

	public boolean isEmpty() {
		if (head == null) {
			return true;
		} else {
			return false;
		}

	}

	public void insertAtFront(int x) {
		Node n = new Node(x);
		if (isEmpty()) {
			head = n;
		} else {
			n.next = head;
			head.previous = n;
			head = n;
		}
	}

	public void insertAtBack(int x) {
		Node n = new Node(x);

		if (isEmpty()) {
			tail = n;
		} else {
			n.previous = tail;
			tail.next = n;
			tail = n;
		}
	}

	public void displayForward() {
		if (isEmpty()) {
			System.out.println("Nothing to show.");
		} else {
			Node current = head;
			while (current != null) {
				System.out.println(current.data);
				current = current.next;
			}
		}
	}

	public void displayBackward() {
		if (isEmpty()) {
			System.out.println("Nothing to show.");
		} else {
			Node current = tail;
			while (current != null) {
				System.out.println(current.data);
				current = current.previous;
			}
		}
	}

	public void deleteFromFront() {
		if (isEmpty()) {
			System.out.println("Nothing to delete");
		} else {

			head = head.next;

		}
	}

	public void deleteFromtBack() {
		if (isEmpty()) {
			System.out.println("Nothing to delete");
		} else {
			tail = tail.previous;
			tail.next = null;

		}

	}

	public void deleteFromPosition(int p) {
		if (isEmpty()) {
			System.out.println("Nothing to delete");
		} else {
			int countNb = 0;

			Node current = head;

			while (current != null && countNb < p) {

				current = current.next;
				countNb++;

			}
			if (current == null) {
				return;
			}
			if (current.previous != null) {
				current.previous.next = current.next;
			} else {
				head = current.next;
			}
			if (current.next != null) {
				current.next.previous = current.previous;
			} else {
				tail = current.previous;
			}
		}

	}

	public int occurenceNb(int x) {
		if (isEmpty()) {
			return 0;
		} else {
			Node current = head;
			int countX = 0;
			;
			while (current != null) {
				if (current.data == x) {
					countX++;
				}
				current = current.next;
			}
			return countX;
		}
	}

	public void changeNb(int x, int y) {
		if (isEmpty()) {
			System.out.println("Nothing to change");
		} else {
			Node current = head;

			while (current != null) {
				if (current.data == x) {
					current.data = y;
				}
				current = current.next;
			}
		}

	}

	public void replaceOddEven() {
		replaceOddEvenRecursive(head);

	}

	public void replaceOddEvenRecursive(Node n) {
		if (n == null) {
			return;

		}
		if (n.data % 2 == 0) {
			n.data = 1;
		} else {
			n.data = 0;
		}
		replaceOddEvenRecursive(n.next);

	}
}
