
public class Stack {
	int top;
	int[] S;
	int size;

	public Stack(int size) {
		top = 0;
		this.size = size;
		S = new int[size];
	}

	public boolean isEmpty() {
		if (S.length == 0) {
			return true;
		} else {
			return false;
		}
	}

	public void push(int x) {
		if (top == S.length - 1) {
			System.out.println("Stack is full.");
		} else {
			top++;
			S[top] = x;
		}
	}

	public int pop() {
		if (isEmpty()) {
			System.out.println("Nothing to delete");
		}
		int pop = S[top];
		top--;

		return pop;

	}

	public int peek() {
		if (isEmpty()) {
			System.out.println("No elements");
		}

		return S[top];

	}

	public int stackSize(Stack s) {
		int size = 0;
		for (int i = top; i >= 0; i--) {
			size++;
		}
		return size;

	}

	public Stack copyStack() {

		int size = stackSize(this);
		Stack temp = new Stack(size);
		Stack c = new Stack(size);
		for (int i = 0; i < size; i++) {
			int a;
			a = pop();
			temp.push(a);

		}
		for (int i = 0; i < size; i++) {
			int a;
			a = temp.pop();
			c.push(a);
		}
		return c;
	}

	public Stack reverse() {
		int size = stackSize(this);
		Stack temp = new Stack(size);
		for (int i = 0; i < size; i++) {
			int a;
			a = pop();
			temp.push(a);
		}
		return temp;
	}

	public Stack sortStack() {
		int size = stackSize(this);
		Stack copy = this.copyStack();
		Stack temp = new Stack(size);
		
		while(!copy.isEmpty()) {
			int a;
			a = copy.pop();
			
			while(!temp.isEmpty() && temp.peek() < a) {
				int x;
				x = temp.pop();
				copy.push(x);
				
			}
			temp.push(a);
		}
		return temp;
	}
	public boolean isPalindrome() {
		Stack copy = this.copyStack();
		Stack reverse = this.reverse();
		
		while(!copy.isEmpty()) {
			int a = copy.pop();
			int x = reverse.pop();
			
			if(a!=x) {
				return false;
			}
		}
		return true;
	}
}
