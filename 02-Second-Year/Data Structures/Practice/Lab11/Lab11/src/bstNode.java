
public class bstNode {
	public int key;
	public bstNode right;
	public bstNode left;
	
	
	public bstNode() {
		key = 0;
		right = null;
		left = null;
		
		
	}
	public bstNode(int key) {
		this.key = key;
		right = null;
		left = null;
	}
	public bstNode(int key, bstNode left, bstNode right) {
		this.key = key;
		this.left = left;
		this.right = right;
	}

}
