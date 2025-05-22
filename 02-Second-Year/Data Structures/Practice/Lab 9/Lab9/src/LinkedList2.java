
public class LinkedList2 {

	private Node2 first;
	private String name;

	public LinkedList2() {
		first = null;
		name = "";
	}

	public LinkedList2(String name) {
		first = null;
		this.name = name;
	}

	public boolean isEmpty() {
		return first == null;
	}

	public void insertAtFront(int v) {
		Node2 n = new Node2(v);
		n.next = first;
		first = n;
	}

	public void insertAtBackPr(int v, int p) {
		Node2 n = new Node2(v, p);
		if (isEmpty()) {
			first = n;
		}
		n.next = first;
		first = n;
	}

	public void priorityEnqueue(int a, int priority2) {
		Node2 n = new Node2(a, priority2);
		boolean flag = false;

		if (isEmpty())
			first = n;

		else {
			Node2 current = first, prev = first;

			if (priority2 > current.priority) {
				n.next = first;
				first = n;

			} else {
				while (priority2 < current.priority) {
					if (current.next == null) {
						insertAtBackPr(a, priority2);
						flag = true;
						break;
					}

					prev = current;
					current = current.next;
				}

				if (!flag) {
					n.next = current;
					prev.next = n;
				}
			}

		}

	}

	public int deleteFromFront() {
		Node2 current = first, prev = first;
		int x;

		if (isEmpty())
			return -1;

		else {
			while (current.next != null) {
				prev = current;
				current = current.next;
			}

			if (prev == current) {
				x = prev.data;
				first = null;
				return x;

			} else {
				x = current.data;
				prev.next = null;
				return x;
			}
		}
	}

	public void display() {
		Node2 current = first;

		while (current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}

		System.out.println();
	}

}
