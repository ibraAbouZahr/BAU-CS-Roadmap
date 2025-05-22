import java.util.ArrayList;

public class Node {
	private Object state;
	private Node parent;
	private int pathCost;
	private Action action;

	public Node(Object state, Node parent, int pathCost, Action action) {
		super();
		this.state = state;
		this.parent = parent;
		this.pathCost = pathCost;
		this.action = action;
	}

	public Node(Object initial, Object object) {
		// TODO Auto-generated constructor stub
	}

	public Object getState() {
		return state;
	}

	public void setState(Object state) {
		this.state = state;
	}

	public Node getParent() {
		return parent;
	}

	public void setParent(Node parent) {
		this.parent = parent;
	}

	public int getPathCost() {
		return pathCost;
	}

	public void setPathCost(int pathCost) {
		this.pathCost = pathCost;
	}

	public Action getAction() {
		return action;
	}

	public void setAction(Action action) {
		this.action = action;
	}
	
	public ArrayList<Node> getPathFromRoot() {
		ArrayList<Node> path = new ArrayList<>();
		Node current = this.parent;
		
		while(current!= null) {
			path.add(current);
			
			// adding the nodes to the array list
		}
		return path;
		
	}

}
