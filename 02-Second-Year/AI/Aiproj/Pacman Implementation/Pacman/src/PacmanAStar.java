import entities.*;
import tests.TestInput;
import tests.TestOutput;

import java.util.*;

class PacmanAStar {

    // Static variables to track counts and timings
    private static int visitedCount = 0;
    private static int exploredCount = 0;

    private static void play(World world, Agent initialAgent, Agent targetAgent) {
        LinkedHashSet<String> exploredMoves = new LinkedHashSet<>();
        LinkedHashSet<String> visitedMoves = new LinkedHashSet<>();

        Queue<Agent> queue = new PriorityQueue<>((prevAgent, nextAgent) -> 
            (int) (Score.fScore(initialAgent, nextAgent, targetAgent) - Score.fScore(initialAgent, prevAgent, targetAgent)));
        queue.add(initialAgent);
        visitedMoves.add(initialAgent.state.getMove());
        visitedCount++;  // Increment visited count

        while (!queue.isEmpty()) {
            Agent currentAgent = queue.poll();
            exploredMoves.add(currentAgent.state.getMove());
            exploredCount++;  // Increment explored count

            if (currentAgent.isGoal(world)) {
                TestOutput.printExpands(exploredMoves);
                TestOutput.printPath(currentAgent);
                return;
            }
            for (Action action : Action.values()) {
                Agent nextAgent = currentAgent.transition(world, action);
                if (nextAgent != null && !visitedMoves.contains(nextAgent.state.getMove())) {
                    visitedMoves.add(nextAgent.state.getMove());
                    queue.add(nextAgent);
                    visitedCount++;  // Increment visited count
                }
            }
        }
    }

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();  // Start timing

        Scanner scanner = new Scanner(TestInput.TEST_1);

        int packmanr = scanner.nextInt();
        int packmanc = scanner.nextInt();
        int foodr = scanner.nextInt();
        int foodc = scanner.nextInt();
        int width = scanner.nextInt();
        int height = scanner.nextInt();

        char[][] grid = new char[width][height];
        for (int r = 0; scanner.hasNext() && r < height; r++) {
            String row = scanner.next();
            for (int c = 0; c < row.length(); c++) {
                grid[r][c] = row.charAt(c);
            }
        }

        World world = new World(grid, width, height);
        Agent targetAgent = new Agent(new State(foodr, foodc));
        Agent initialAgent = new Agent(new State(packmanr, packmanc));

        play(world, initialAgent, targetAgent);

        long endTime = System.currentTimeMillis();  // End timing
        long totalTime = endTime - startTime;
        System.out.println("A* Algorithm:");
        System.out.println("Time taken: " + totalTime + " ms");
        System.out.println("Visited nodes: " + visitedCount);
        System.out.println("Explored nodes: " + exploredCount);
    }
}
