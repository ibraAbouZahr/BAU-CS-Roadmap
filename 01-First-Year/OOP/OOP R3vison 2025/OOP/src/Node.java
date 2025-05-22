
public class Node {

	int data;
	Node next;

	Node(int data) {
		this.data = data;
		next = null;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	class LinkedList {
		Node head;

		public void insertAtFront(int data) {
			Node newNode = new Node(data);
			newNode.next = head;
			head = newNode;
		}

		public void insertAtPosition(int data, int position) {
			Node newNode = new Node(data);
			Node current = head;

			if (position == 0) {
				insertAtFront(data);
			}
			for (int i = 0; i < position - 1; i++) {
				if(current == null) {
					System.out.println("Out of bounds");
				}
				current = current.next;

			}
			newNode.next = current;
			current.next = newNode;
		}
	}

}
