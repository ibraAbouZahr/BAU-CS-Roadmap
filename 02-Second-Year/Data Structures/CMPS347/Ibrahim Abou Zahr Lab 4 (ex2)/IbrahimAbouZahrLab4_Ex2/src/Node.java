
public class Node {
	Task task;
	Node next;

	public Node(Task task) {
		this.task = task;
		next = null;
	}

	public Task getTask() {
		return task;
	}

	public void setTask(Task task) {
		this.task = task;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

}
