import entities.*;
import tests.TestInput;
import tests.TestOutput;

import java.util.*;

class PacmanUCS {
    // Static variables to track node counts
    private static int visitedCount = 0;
    private static int exploredCount = 0;

    private static void play(World world, Agent initialAgent) {
        LinkedHashSet<String> exploredMoves = new LinkedHashSet<>();
        LinkedHashSet<String> visitedMoves = new LinkedHashSet<>();

        Queue<Agent> queue = new PriorityQueue<>((o1, o2) -> (int) (Score.gScore(initialAgent, o2) - Score.gScore(initialAgent, o1)));
        queue.add(initialAgent);
        visitedMoves.add(initialAgent.state.getMove());
        visitedCount++; // Increment visited count

        while (queue.size() > 0) {
            Agent currentAgent = queue.poll();
            exploredMoves.add(currentAgent.state.getMove());
            exploredCount++; // Increment explored count

            for (Action action : Action.values()) {
                Agent nextAgent = currentAgent.transition(world, action);
                if (nextAgent != null) {
                    if (nextAgent.isGoal(world)) {
                        TestOutput.printExpands(exploredMoves);
                        TestOutput.printPath(nextAgent);
                        return;
                    }
                    String nextMove = nextAgent.state.getMove();
                    if (!visitedMoves.contains(nextMove)) {
                        visitedMoves.add(nextAgent.state.getMove());
                        queue.add(nextAgent);
                        visitedCount++; // Increment visited count
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        Scanner scanner = new Scanner(TestInput.TEST_1);

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
        Agent initialAgent = new Agent(new State(packmanr, packmanc));

        play(world, initialAgent);

        long endTime = System.currentTimeMillis();
        long totalTime = endTime - startTime;
        System.out.println("UCS Algorithm:");
        System.out.println("Time taken: " + totalTime + " ms");
        System.out.println("Visited nodes: " + visitedCount);
        System.out.println("Explored nodes: " + exploredCount);
    }
}
