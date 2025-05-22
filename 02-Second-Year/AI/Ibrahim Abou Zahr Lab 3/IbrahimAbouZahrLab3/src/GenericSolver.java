import java.util.Scanner;

public class GenericSolver {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		

	}
	private void solve(FormulatedProblem p, SearchAlgorithm alg) 
	{
		alg.solve(p);
	}
	
	GenericSolver s = new GenericSolver();
	SearchAlgorithm alg = new BFS(); 
	FormulatedProblem p = new EightPuzzleProblem();
	
}
