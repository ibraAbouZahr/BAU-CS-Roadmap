
public class ArrayInt {
	int[] a;
	int currentNb;
	
	public ArrayInt(int size) {
		this.a = new int[size];
		this.currentNb = 0;
	}
	public boolean isEmpty() {
		if(a.length == 0) {
			return true;
		}
		return false;
	}
	public boolean isFull() {
		if(currentNb == a.length) {
			return true;
		}
		return false;
	}
	public void InsertElementAtFront(int value) {
		if(!isFull()) {
			currentNb++;
			for(int i = currentNb - 1; i > 0; i-- ) {
				a[i] = a[i-1];
			}
			a[0] = value;
		}
		System.out.println("Array is Full!");
	}
	public void InsertElementAtBack(int value) {
		if(!isFull()) {
			currentNb++;
			a[currentNb - 1] = a[value];
		}
		System.out.println("Array is full!");
	}
	public void InsertElementAtPosition(int value, int position) {
		if(!isFull()) {
			currentNb++;
			for(int i = currentNb -  1; i > position; i--) {
				a[i] = a[i-1];
				
			}
			a[position] = value;
		}
	}
}
