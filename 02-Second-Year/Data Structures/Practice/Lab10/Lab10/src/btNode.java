
public class btNode {
	public int key;
	public btNode left, right;

	public btNode() {
		key = 0;
		left = null;
		right = null;
	}

	public btNode(int key) {
		this.key = key;
		this.left = null;
		this.right = null;
	}

	public btNode(int key, btNode left, btNode right) {
		this.key = key;
		this.left = left;
		this.right = right;
	}
}