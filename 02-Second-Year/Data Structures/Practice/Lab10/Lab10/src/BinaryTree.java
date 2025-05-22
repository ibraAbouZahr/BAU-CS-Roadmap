import java.util.*;

public class BinaryTree {

	private btNode root;

	public BinaryTree() {
		root = null;
	}

	public boolean isEmpty() {
		if (root == null) {
			return true;
		}
		return false;
	}

	public void insert(int k) {
		insertIntoBinaryTree(k, root);
	}

	public btNode insertIntoBinaryTree(int k, btNode node) {

		if (node == null) {
			node = new btNode(k);
		} else if (node.right == null) {

			node.right = insertIntoBinaryTree(k, node.right);

		} else {
			node.left = insertIntoBinaryTree(k, node.left);
		}
		return node;
	}

	public void display() {
		displayTree(root, 0);

	}

	public void displayTree(btNode node, int level) {
		if (node != null) {
			displayTree(node.right, level + 1);
			{
				for (int i = 0; i < level; i++) {
					System.out.println("/t");
				}
				System.out.println(node.key);
				displayTree(node.left, level + 1);
			}
		}
	}

	public int getheight() {
		return height(root);

	}

	public int height(btNode node) {
		if (node == null) {
			return 0;
		} else {
			return 1 + Math.max(height(node.left), height(node.right));
		}

	}
	public int countNodes() {
		return countBinaryTreeNodes(root);
	}
	public int countBinaryTreeNodes(btNode node) {
		if(node == null) {
			return 0;
		}
		else {
			return 1 + countBinaryTreeNodes(node.left) + countBinaryTreeNodes(node.right);
		}
	}
	public void inOrder() {
		
	}
	public void inOrderPrint(btNode node) {
		if(node == null) {
			inOrderPrint(node.left);
			System.out.println(node.key);
			inOrderPrint(node.right);
			
		}
	}
	public void addToLeft(btNode node, String element) {
		
	}

}
