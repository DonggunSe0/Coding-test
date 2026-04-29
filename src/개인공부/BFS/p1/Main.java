package 개인공부.BFS.p1;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        // 그래프를 2차원 배열로 표현한다.
        // graph[1]은 1번 노드와 연결된 노드 목록을 의미한다.
        // 예: graph[1] = {2, 3, 8}
        // 즉, 1번 노드는 2번, 3번, 8번 노드와 연결되어 있다.
        //
        // 인덱스 번호를 노드 번호와 맞추기 위해 graph[0]은 비워둔다.
        int[][] graph = {
                {},
                {2, 3, 8},
                {1, 6, 8},
                {1, 5},
                {5, 7},
                {3, 4, 7},
                {2},
                {4, 5},
                {1, 2}
        };
        // 방문 여부를 저장하는 배열
        // visited[1]이 true면 1번 노드는 이미 방문했다는 뜻이다.
        // 노드가 1번부터 8번까지 있으므로 크기를 9로 만든다.
        boolean[] visited = new boolean[9];

        // 1번 노드부터 BFS 탐색을 시작한다.
        System.out.println(bfs(1, graph, visited));

        // 출력 결과:
        // 1 -> 2 -> 3 -> 8 -> 6 -> 5 -> 4 -> 7 ->
    }
    static String bfs(int start, int[][] graph, boolean[] visited) {

        // 탐색 순서를 문자열로 저장하기 위한 객체
        StringBuilder sb = new StringBuilder();

        // BFS에서 사용할 큐를 생성한다.
        // BFS는 먼저 발견한 노드를 먼저 탐색해야 하므로 Queue를 사용한다.
        Queue<Integer> q = new LinkedList<Integer>();

        // 시작 노드를 큐에 넣는다.
        q.offer(start);

        // 시작 노드를 방문 처리한다.
        // 큐에 넣는 순간 방문 처리해야 같은 노드가 중복으로 큐에 들어가지 않는다.
        visited[start] = true;

        // 큐가 빌 때까지 반복한다.
        // 큐가 비었다는 것은 더 이상 탐색할 노드가 없다는 뜻이다.
        while (!q.isEmpty()) {

            // 큐에서 가장 먼저 들어온 노드를 꺼낸다.
            // 현재 탐색할 노드이다.
            int nodeIndex = q.poll();

            // 현재 노드를 탐색 순서에 추가한다.
            sb.append(nodeIndex + " -> ");

            // 현재 노드와 연결된 노드들을 하나씩 확인한다.
            for (int i = 0; i < graph[nodeIndex].length; i++) {

                // 현재 노드와 연결된 노드 하나를 꺼낸다.
                int temp = graph[nodeIndex][i];

                // 아직 방문하지 않은 노드라면
                if (!visited[temp]) {

                    // 방문 처리한다.
                    // 여기서 방문 처리하는 이유는 같은 노드가 큐에 중복으로 들어가는 것을 막기 위해서다.
                    visited[temp] = true;

                    // 나중에 탐색하기 위해 큐에 넣는다.
                    q.offer(temp); //큐에 삽입 해두는거네 방문하면서 겸사 겸사
                }
            }
        }

        // BFS 탐색 순서를 문자열로 반환한다.
        return sb.toString();
    }
}
