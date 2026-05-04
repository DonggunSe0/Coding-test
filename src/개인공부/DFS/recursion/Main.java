package 개인공부.DFS.recursion;

public class Main {
    public static void main(String[] args) {

        /*
                                        1
                                      /   \
                                     2     3
                                    / \   /
                                   4    5
        * */
        int[][] graph = {
                {},
                {2, 3},
                {1, 4, 5},
                {1, 5},
                {2},
                {2, 3}
        };

        boolean[] visited = new boolean[6];

        dfs(1, visited, graph);
    }

    static void dfs(int cur, boolean[] visited, int[][] graph) {
        visited[cur] = true;
        System.out.println(cur);

        for (int next : graph[cur]) {
            if (!visited[next]) {
                dfs(next, visited, graph);
            }
        }
    }
}
