import java.util.*;

public class Agent {
	private int x;
	private int y;
	private double dirtiness;

	public Agent(int x, int y) {
		this.x = x - 1;
		this.y = y - 1;
	}

	public void Move(int row, int col) {
		int move = (int) ((int) 4 * Math.random());

		switch (move) {

		case 0:
			if (x > 0) {
				x--;
				// Go up
			}
		case 1:
			if (x < row - 1) {
				x++;
			}
			// Go down
		case 2:
			if (y > 0) {
				y--;
			}
			// Go left
		case 3:
			if (y < col - 1) {
				y++;
			}
			// Go right
		}

	}

	public void DisplayStatus() {
		System.out.println("The agent is at position: " + x + "," + y);
		System.out.println("Agent's total dirtiness: " + dirtiness);
	}
	public void Suck(double[][] grid) {
		dirtiness = dirtiness + grid[x][y];
		grid[x][y] = 0.0;
		
	}
}
