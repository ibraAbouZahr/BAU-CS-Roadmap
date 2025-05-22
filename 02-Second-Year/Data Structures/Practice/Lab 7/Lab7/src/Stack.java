
public class Stack extends LinkedList {
	public Stack() {
		super();

	}

	public int pop() {
		return deleteFromFront();
	}

	public void push(int a) {

		insertAtFront(a);
	}

	public int peek() {
		if (isEmpty()) {
			System.out.println("Stack is empty. Cannot peek.");
			return -1;
		}
		return first.data;
	}

	public void display() {
		super.display();
	}

	public Stack getMultipleof(int k) {
		Stack temp = new Stack();

		Stack multiple = new Stack();

		while (!isEmpty()) {
			int a = pop();

			if (a % k == 0) {
				temp.push(a);
			}

		}
		while (!temp.isEmpty()) {
			int a = temp.pop();
			multiple.push(a);
		}
		return multiple;

	}

	public int summationOfOdd() {
		int sum = 0;
		Stack temp = new Stack();

		while (!isEmpty()) {
			int a = pop();
			if (a % 2 != 0) {
				sum = sum + a;
			}
			temp.push(a);
		}
		return sum;
	}

	public int getMin() {
		Stack temp = new Stack();
		int min = peek();
		while (!isEmpty()) {
			int a = pop();

			if (min > a) {
				min = a;
			}
			temp.push(a);
		}
		while (!temp.isEmpty()) {
			int a = temp.pop();
			push(a);
		}
		return min;
		

	}

	public void deletesecondelement() {
		Stack temp = new Stack();
		Stack s = new Stack();

		if (!isEmpty()) {
			int a = pop();
			temp.push(a);

			if (!isEmpty()) {
				a = pop();

				while (!temp.isEmpty()) {
					a = temp.pop();
					push(a);
				}
			}

		}

	}
}
