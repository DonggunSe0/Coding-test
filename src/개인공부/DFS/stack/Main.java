package 개인공부.DFS.stack;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        int[][] graph = {
                {},
                {2, 3},
                {1, 4, 5},
                {1, 5},
                {2},
                {2, 3}
        };

        boolean[] visited = new boolean[6];

        dfsStack(1, visited, graph);
    }

    static void dfsStack(int start, boolean[] visited, int[][] graph) {
        Stack<Integer> stack = new Stack<>();

        stack.push(start);
        visited[start] = true;

        while (!stack.isEmpty()) {
            int cur = stack.pop();
            System.out.println(cur);

            for (int i = graph[cur].length - 1; i >= 0; i--) {
                int next = graph[cur][i];

                if (!visited[next]) {
                    visited[next] = true;
                    stack.push(next);
                }
            }
        }
    }
}
