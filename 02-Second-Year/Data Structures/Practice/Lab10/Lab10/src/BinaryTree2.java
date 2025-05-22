
public class BinaryTree2 {

	public btNode2 root;

	public BinaryTree2() {
		root = null;
	}

	public void setRoot(btNode2 root) {
		this.root = root;
	}

	public void addToLeft(btNode2 node, String element) {
		if (node == null) {
			btNode2 n = new btNode2(element);
			node.setLeft(n);
		} else if (node.getLeft() != null) {
			addToLeft(node.getLeft(), element);
		}
	}

	public void displayTree(btNode2 node, int level) {
		if (node != null) {
			displayTree(node, level + 1);
			for (int i = 0; i < level; i++) {
				System.out.println("/t");
			}
			System.out.println(node.getElement());
			displayTree(node.getLeft(), level + 1);
		}
	}
	

}
