

public class Node2 {
	
	int data;
	int priority;
	Node2 next;
	
	public Node2() {
		data = 0;
		priority = 0;
		next = null;
	}
	
	public Node2(int d) {
		data = d;
		next = null;
	}
	
	public Node2(int d, int p) {
		data = d;
		priority = p;
		next = null;
	}

}
