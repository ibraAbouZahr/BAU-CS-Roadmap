package tests;

import java.util.LinkedHashSet;
import entities.State;
import entities.Agent;

public class TestOutput {
    public static void printExpands(LinkedHashSet<String> exploredMoves) {
        System.out.print("Explored Moves: [");
        String[] movesArray = exploredMoves.toArray(new String[0]);
        for (int i = 0; i < movesArray.length; i++) {
            System.out.print(movesArray[i]);
            if (i != movesArray.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static void printPath(Agent agent) {
        System.out.print("Pacman's Path: [");
        String[] pathArray = getPathArray(agent);
        for (int i = 0; i < pathArray.length; i++) {
            System.out.print(pathArray[i]);
            if (i != pathArray.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    private static String[] getPathArray(Agent agent) {
        int pathLength = getPathLength(agent);
        String[] pathArray = new String[pathLength];
        int index = pathLength - 1;
        while (agent != null) {
            State state = agent.state;
            pathArray[index--] = "(" + state.getRow() + ", " + state.getColumn() + ")";
            agent = agent.parent;
        }
        return pathArray;
    }

    private static int getPathLength(Agent agent) {
        int length = 0;
        while (agent != null) {
            length++;
            agent = agent.parent;
        }
        return length;
    }
}
