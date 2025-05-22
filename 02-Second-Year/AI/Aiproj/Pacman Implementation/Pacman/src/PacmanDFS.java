import java.util.*;
import entities.Action;
import entities.Agent;
import entities.State;
import entities.World;
import tests.TestInput;
import tests.TestOutput;

class PacmanDFS {

    // Static variables to track the count of visited and explored nodes
    private static int visitedCount = 0;
    private static int exploredCount = 0;

    private static void play(World world, Agent initialAgent) {
        LinkedHashSet<String> exploredMoves = new LinkedHashSet<>();
        LinkedHashSet<String> visitedMoves = new LinkedHashSet<>();

        Stack<Agent> stack = new Stack<>();
        stack.push(initialAgent);
        visitedMoves.add(initialAgent.state.getMove());
        visitedCount++; // Increment visited count

        while (!stack.empty()) {
            Agent currentAgent = stack.pop();
            exploredMoves.add(currentAgent.state.getMove());
            exploredCount++; // Increment explored count

            if (currentAgent.isGoal(world)) {
                TestOutput.printExpands(exploredMoves);
                TestOutput.printPath(currentAgent);
                return;
            }
            for (Action action : Action.values()) {
                Agent nextAgent = currentAgent.transition(world, action);
                if (nextAgent != null && !visitedMoves.contains(nextAgent.state.getMove())) {
                    visitedMoves.add(nextAgent.state.getMove());
                    stack.push(nextAgent);
                    visitedCount++; // Increment visited count
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

        char[][] grid = new char[width][height];
        for (int r = 0; scanner.hasNext() && r < height; r++) {
            String row = scanner.next();
            for (int c = 0; c < row.length(); c++) {
                grid[r][c] = row.charAt(c);
            }
        }

        World world = new World(grid, width, height);
        Agent initialAgent = new Agent(new State(packmanr, packmanc));

        play(world, initialAgent);

        long endTime = System.currentTimeMillis();
        long totalTime = endTime - startTime;
        System.out.println("DFS Algorithm:");
        System.out.println("Time taken: " + totalTime + " ms");
        System.out.println("Visited nodes: " + visitedCount);
        System.out.println("Explored nodes: " + exploredCount);
    }
}
