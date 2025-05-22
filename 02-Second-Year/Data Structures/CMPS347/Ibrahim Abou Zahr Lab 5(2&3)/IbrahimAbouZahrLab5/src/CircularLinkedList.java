
public class CircularLinkedList {
	private Node2 head;
	private Node2 tail;

	public CircularLinkedList() {
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
		Node2 n = new Node2(x);

		if (isEmpty() == true) {
			head = n;
			tail = n;
		} else {
			n.next = head;
			head = n;
			tail.next = head;
		}

	}

	public void insertAtBack(int x) {
		Node2 n = new Node2(x);
		if (isEmpty() == true) {

			head = n;
			tail = n;

		} else {
			tail.next = n;
			tail = n;
			n.next = head;
		}
	}

	public void display() {
		System.out.println("---------------------------------");
		System.out.println("Circular Linked List elements: ");
		Node2 current = head;

		while (!isEmpty()) {
			System.out.println(current.data + " --> ");
			current = current.next;

		}

	}

	public void deleteFromFront() {
		if (!isEmpty()) {
			head = head.next;
			tail.next = head;
		} else {
			System.out.println("The circular linked list is empty!  ");
		}

	}

	public void deleteFromBack() {
		if (!isEmpty()) {
			Node2 current = head;

			while (current != null) {
				current = current.next;

			}
			current.next = head;
			tail = current;

		}
	}

	public CircularLinkedList evenCLL() {
		CircularLinkedList even = new CircularLinkedList();
		if (!isEmpty()) {

			Node2 current = head;

			while (current != tail) {
				if (current.data % 2 == 0) {
					even.insertAtFront(current.data);

				}
				current = current.next;
			}

		}
		return even;

	}

}
