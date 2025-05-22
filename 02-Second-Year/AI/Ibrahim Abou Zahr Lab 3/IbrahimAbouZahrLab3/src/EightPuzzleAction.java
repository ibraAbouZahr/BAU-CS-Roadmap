
public class EightPuzzleAction implements Action {
	private String name; // movement

	public EightPuzzleAction(String name) {
		super();
		this.name = name;
	}

	@Override
	public Object apply(Object state) {
		int[] s = (int[]) state;
		int blankPosition = 0;
		int newBlankPosition = 0;
		for (int i = 0; i < s.length; i++) {
			if (s[i] == 0) {
				blankPosition = i;
			}
		}

		if (name.equals("UP")) {

			if (blankPosition >= 3) {
				newBlankPosition = blankPosition - 3;

			}

		} else if (name.equals("DOWN")) {
			if (blankPosition < 6) {
				newBlankPosition = blankPosition + 3;
			}
		} else if (name.equals("LEFT")) {
			if (blankPosition % 3 != 0) {
				newBlankPosition = blankPosition - 1;
			} else if (name.equals("RIGHT")) {
				if ((blankPosition + 1) % 3 != 0) {
					newBlankPosition = blankPosition + 1;
				}

			}
		}
		return s;
	}

	@Override
	public int getCostPerAction() {

		return 1;
	}

}
