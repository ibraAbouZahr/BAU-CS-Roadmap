import java.util.*;

public class BinarySearchTree {

	private bstNode root;

	public BinarySearchTree() {
		root = null;
	}

	public boolean isEmpty() {
		if (root == null) {
			return true;
		}
		return false;
	}

	public void insert(int k) {
		insertIntoBST(k, root);
	}

	public bstNode insertIntoBST(int k, bstNode node) {
		if (node == null) {
			bstNode n = new bstNode(k);
		} else if (node.right == null) {
			return insertIntoBST(k, node.right);
		} else {
			return insertIntoBST(k, node.left);
		}
		return node;
	}

	public int getheight() {
		return height(root);
	}

	public int height(bstNode node) {
		if (node == null) {
			return 0;
		} else {
			return 1 + Math.max(height(node.right), height(node.left));
		}
	}

	public int countNodes() {
		return countBSTNodes(root);
	}

	public int countBSTNodes(bstNode node) {
		if (node == null) {
			return 0;
		} else {
			return 1 + countBSTNodes(node.right) + countBSTNodes(node.left);
		}
	}

	public boolean search(int k) {
		return searchBST(k, root);
	}

	public boolean searchBST(int k, bstNode node) {
		if (node == null) {
			return false;
		} else if (node.key == k) {
			return true;
		} else if (k > node.key) {
			return searchBST(k, node.right);
		} else {
			return searchBST(k, node.left);
		}
	}

	public int findMax() {
		bstNode current = root;

		if (isEmpty()) {
			return -1;
		} else {
			while (current.right != null) {
				current = current.right;
			}
			return current.key;
		}

	}

	public int findSecondMin() {
		bstNode current = root;

		if (isEmpty()) {
			return -1;
		} else {
			while (current.left.left != null) {
				current = current.left;

			}
			return current.key;
		}
	}

	public int leafNode() {
		return leafNodeinBST(root);
	}

	public int leafNodeinBST(bstNode node) {
		if (node == null) {
			return 0;
		} else if (node.right == null && node.left == null) {
			return 1;

		} else {
			return leafNodeinBST(node.left) + leafNodeinBST(node.right);
		}
	}

	public int internalNode() {
		return internalNodeinBST(root);

	}

	public int internalNodeinBST(bstNode node) {
		if (node == null) {
			return 0;
		} else if ((node.right != null && node.left == null) || (node.right == null && node.left != null)) {
			return 1;

		} else {
			return internalNodeinBST(node.right) + internalNodeinBST(node.left);
		}
	}

}
