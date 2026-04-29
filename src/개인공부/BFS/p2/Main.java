package 개인공부.BFS.p2;

import java.util.ArrayDeque;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        int[][] graph = {
                {},
                {2, 3, 8}, //1
                {1, 6, 8}, //2
                {1,5}, //3
                {5, 7}, //4
                {4, 7}, //5
                {2}, //6
                {4, 5}, //7
                {1, 2} //8
        }; //8

        boolean[] visited = new boolean[9];

        String a = bfs(1, graph, visited);

        System.out.println(a);
    }

    static String bfs(int start, int[][] graph, boolean[] visited) {
        StringBuilder sb = new StringBuilder();
        Queue<Integer> queue = new ArrayDeque<>(); //
        queue.add(start);
        visited[start] = true;

        while (!queue.isEmpty()) {
            int node = queue.poll();

            if (sb.length() > 0) {
                sb.append(" -> ");
            } // 1번 노드 일때는 " -> " 안붙이게 하는거네
            sb.append(node);

            for (int i = 0; i < graph[node].length; i++) {
                // 현재 노드와 연결된 노드 하나를 꺼낸다.
                int temp = graph[node][i];
                if (!visited[temp]) {
                    visited[temp] = true;
                    queue.add(temp); //큐에 삽입 해두는거네 방문하면서 겸사 겸사
                }
            }

        }
        // BFS 탐색 순서를 문자열로 반환한다.
        return sb.toString();
    }
}
