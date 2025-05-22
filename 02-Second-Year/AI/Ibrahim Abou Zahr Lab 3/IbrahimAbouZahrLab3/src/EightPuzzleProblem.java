import java.util.Arrays;

public class EightPuzzleProblem implements FormulatedProblem {

	int[] initial;

	public EightPuzzleProblem(int[] initial) {
		super();
		this.initial = initial;
	}

	public EightPuzzleProblem() {
		if (initial == null || initial.length != 9) {
			System.out.println("invalid");
		
		} else {
			this.initial = Arrays.copyOf(initial, initial.length);
		}
	}

	@Override
	public Object getInitialState() {
		return Arrays.copyOf(initial, initial.length);
	}

	@Override
	public boolean isGoalState(Object state) {
		// TODO Auto-generated method stub
		return false;
	}
	

}
