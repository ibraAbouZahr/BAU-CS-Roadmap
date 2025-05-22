import java.util.ArrayList;

public class BFS implements SearchAlgorithm {

	private ArrayList<Node> queue;

	public BFS() {
		super();
		this.queue = queue;
	}

	@Override
	public void solve(FormulatedProblem p) {

		Object initial = p.getInitialState();

		Node n = new Node(initial, null);
		push(n);

	}

	private void push(Node n) {
		queue.add(n);

	}

}
