import java.util.*;

public class Queue extends LinkedList {

	public Queue() {
		super();
	}

	public void enqueue(int n) {

		insertAtBack(n);

	}

	public int dequeue() {

		return deleteFromFront();
	}

	public Queue getPerfectSquares() {
		Queue square = new Queue();
		Queue temp = new Queue();
		int a;
		while (!isEmpty()) {
			a = dequeue();
			int sqrt = (int) Math.sqrt(a);
			if (a == sqrt * sqrt) {
				square.enqueue(a);
			}
			temp.enqueue(a);
		}
		while (!temp.isEmpty()) {
			a = temp.dequeue();
			enqueue(a);
		}
		return square;
	}

	public Queue deleteEveryThirdElement() {
		Queue third = new Queue();
		Queue temp = new Queue();
		int count = 0;
		int a;
		while (!isEmpty()) {
			a = dequeue();
			count++;

			if (count % 3 == 0) {
				third.enqueue(a);
			} else {
				temp.enqueue(a);
			}

			while (!temp.isEmpty()) {
				a = dequeue();
				enqueue(a);
			}

		}
		return this;
	}

	public Queue Merge2Queues(Queue q2) {
		Queue t1 = new Queue();
		Queue t2 = new Queue();
		Queue merge = new Queue();
		int a;
		while (!isEmpty()) {
			a = dequeue();
			t1.enqueue(a);
			merge.enqueue(a);
		}
		while (!q2.isEmpty()) {
			a = dequeue();
			t2.enqueue(a);
			merge.enqueue(a);
		}
		while (!t1.isEmpty()) {
			a = t1.dequeue();
			enqueue(a);
		}
		while (!t2.isEmpty()) {
			a = t2.dequeue();
			q2.enqueue(a);
		}

		return merge;

	}

	public void swapElementsAtOddIndex(Queue q2) {
		Queue temp = new Queue();
		Queue temp2 = new Queue();
		
		int count = 0;
		
		int a;
		int b;
		while(!isEmpty() && !q2.isEmpty() ) {
			a = dequeue();
			b = q2.dequeue();
			
			
			if(count%2 != 0) {
				temp.enqueue(b);
				temp2.enqueue(a);
			}
			else {
				temp.enqueue(a);
				temp2.enqueue(b);
			}
			count++;
		
		}
		
	}

}
