import java.util.*;

import entities.Action;
import entities.Agent;
import entities.State;
import entities.World;
import tests.TestInput;
import tests.TestOutput;

class PacmanDFS {

    private static void play(World world, Agent initialAgent) {
        LinkedHashSet<String> exploredMoves = new LinkedHashSet<>();
        LinkedHashSet<String> visitedMoves = new LinkedHashSet<>();

        Stack<Agent> stack = new Stack<>();
        stack.push(initialAgent);
        visitedMoves.add(initialAgent.state.getMove());

        while (!stack.empty()) {
            Agent currentAgent = stack.pop();
            exploredMoves.add(currentAgent.state.getMove());
            if (currentAgent.isGoal(world)) {
                TestOutput.printExpands(exploredMoves);
                TestOutput.printPath(currentAgent);
                return;
            }
            for (Action action : Action.values()) {
                Agent nextAgent = currentAgent.transition(world, action);
                if (nextAgent != null) {
                    String nextMove = nextAgent.state.getMove();
                    if (!visitedMoves.contains(nextMove)) {
                        visitedMoves.add(nextAgent.state.getMove());
                        stack.push(nextAgent);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner Scanner = new Scanner(TestInput.TEST_5);

        int packmanr = Scanner.nextInt();
        int packmanc = Scanner.nextInt();

        int foodr = Scanner.nextInt();
        int foodc = Scanner.nextInt();

        int width = Scanner.nextInt();
        int height = Scanner.nextInt();

        int r = 0;
        char[][] grid = new char[width][height];
        while (Scanner.hasNext()) {
            String row = Scanner.next();
            for (int c = 0; c < row.length(); c++) {
                grid[r][c] = row.charAt(c);
            }
            ++r;
        }

        World world = new World(grid, width, height);
        Agent initialAgent = new Agent(new State(packmanr, packmanc));

        play(world, initialAgent);
    }
}