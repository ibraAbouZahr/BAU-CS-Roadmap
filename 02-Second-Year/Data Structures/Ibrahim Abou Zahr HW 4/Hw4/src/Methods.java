
public class Methods {
	// Question 13

	public int MaxValue(Node p) {
		Node current = p;
		while (current.right != null) {
			current = current.right;
		}
		return current.data;
	}
	// Question 14

	public int MinValue(Node p) {
		Node current = p;
		while (current.left != null) {
			current = current.left;
		}
		return current.data;
	}
	// Question 15

	public int Count(Node p) {

		if (p == null) {
			return 0;
		}
		return 1 + Count(p.left) + Count(p.right);
	}
	// Question 16

	public int CountInernalNodes(Node p) {
		if (p == null) {
			return 0;
		}
		if (p.left != null || p.right != null) {
			return 1 + CountInernalNodes(p.left) + CountInernalNodes(p.right);
		}
		return 0;

	}

	// Question 17
	public int CountOneNode(Node p) {
		if (p == null) {
			return 0;
		}
		if ((p.left != null && p.right == null) || ((p.left == null && p.right != null))) {
			return 1 + CountOneNode(p.left) + CountOneNode(p.right);
		}
		return 0;

	}

	public int CountLeftChild(Node p) {
		if (p == null) {
			return 0;
		}
		if (p.left != null) {
			return 1 + CountLeftChild(p.left) + CountLeftChild(p.right);
		}
		return 0;

	}

	public int CountRightChild(Node p) {
		if (p == null) {
			return 0;
		}
		if (p.right != null) {
			return 1 + CountRightChild(p.left) + CountRightChild(p.right);
		}
		return 0;

	}

	public int CountLeaves(Node p) {
		if (p == null) {
			return 0;
		}
		if (p.right == null && p.left == null) {
			return 1 + CountLeaves(p.left) + CountLeaves(p.right);
		}
		return 0;

	}

	public int CountLeavesSum(Node p) {
		if (p == null) {
			return 0;
		}
		if (p.right == null && p.left == null) {
			return p.data;
		}
		return CountLeavesSum(p.left) + CountLeavesSum(p.right);

	}

	public boolean isLeaf(Node p) {
		if (p != null && p.left == null & p.right == null) {
			return true;
		}
		return false;
	}

	public int CountLeftLeaves(Node p) {
		if (p == null) {
			return 0;
		}
		if (isLeaf(p.left)) {
			return 1 + CountLeftLeaves(p.left) + CountLeftLeaves(p.right);
		}
		return  CountLeftLeaves(p.left) + CountLeftLeaves(p.right);

	}

	public int LeftLeavesSum(Node p) {
		if (p == null) {
			return 0;
		}
		if (isLeaf(p.left)) {
			return p.data;
		}
		return LeftLeavesSum(p.left) + LeftLeavesSum(p.right);

	}
	public int CountRightLeaves(Node p) {
		if (p == null) {
			return 0;
		}
		if (isLeaf(p.right)) {
			return 1 ;
		}
		return  CountRightLeaves(p.left) + CountRightLeaves(p.right);

	}
	public int RightLeavesSum(Node p) {
		if (p == null) {
			return 0;
		}
		if (isLeaf(p.right)) {
			return p.data;
		}
		return RightLeavesSum(p.left) + RightLeavesSum(p.right);

	}
	public void inOrder(Node p) {
		if(p!=null) {
			inOrder(p.left);
			System.out.println(p.data);
			inOrder(p.right);
		}
	}
	public void postOrder(Node p) {
		if(p!=null) {
			inOrder(p.left);
			inOrder(p.right);
			System.out.println(p.data);
		}
	}
	public void preOrder(Node p) {
		if(p!=null) {
			System.out.println(p.data);
			inOrder(p.left);
			inOrder(p.right);
		}
	}

}
