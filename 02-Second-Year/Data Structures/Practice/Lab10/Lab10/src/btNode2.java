public class btNode2 {
	 String element;
	 private btNode2 left;
	 private btNode2 right;

	btNode2(String element) {
		this.element = element;
	}

	public String getElement() {
		return element;
	}

	public btNode2 getLeft() {
		return left;
	}

	public btNode2 getRight() {
		return right;
	}

	public void setElement(String element) {
		this.element = element;
	}

	public void setLeft(btNode2 left) {
		this.left = left;
	}

	public void setRight(btNode2 right) {
		this.right = right;
	}
}