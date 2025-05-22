import entities.*;

import java.util.*;

import tests.TestInput;
import tests.TestOutput;

class PacmanAStar {

    private static void play(World world, Agent initialAgent, Agent targetAgent) {
        LinkedHashSet<String> exploredMoves = new LinkedHashSet<>();
        LinkedHashSet<String> visitedMoves = new LinkedHashSet<>();

        Queue<Agent> queue = new PriorityQueue<>((prevAgent, nextAgent) -> (int) (Score.fScore(initialAgent, nextAgent, targetAgent) - Score.fScore(initialAgent, prevAgent, targetAgent)));
        queue.add(initialAgent);
        visitedMoves.add(initialAgent.state.getMove());

        while (queue.size() > 0) {
            Agent currentAgent = queue.poll();
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
                        queue.add(nextAgent);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(TestInput.TEST_5);

        int packmanr = scanner.nextInt();
        int packmanc = scanner.nextInt();

        int foodr = scanner.nextInt();
        int foodc = scanner.nextInt();

        int width = scanner.nextInt();
        int height = scanner.nextInt();

        int r = 0;
        char[][] grid = new char[width][height];
        while (scanner.hasNext()) {
            String row = scanner.next();
            for (int c = 0; c < row.length(); c++) {
                grid[r][c] = row.charAt(c);
            }
            ++r;
        }

        World world = new World(grid, width, height);
        Agent targetAgent = new Agent(new State(foodr, foodc));
        Agent initialAgent = new Agent(new State(packmanr, packmanc));

        play(world, initialAgent, targetAgent);
    }
}