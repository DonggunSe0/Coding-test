package Programmers.recursion;

import java.util.*;

class 하노이탑 {
    List<int[]> moves = new ArrayList<>();

    public int[][] solution(int n) {
        hanoi(n, 1, 2, 3);

        int[][] answer = new int[moves.size()][2];
        for (int i = 0; i < moves.size(); i++) {
            answer[i] = moves.get(i);
        }
        return answer;
    }

    public void hanoi(int n, int from, int via, int to) {
        if (n == 1) {
            moves.add(new int[]{from, to});
            return;
        }

        hanoi(n - 1, from, to, via);
        moves.add(new int[]{from, to});
        hanoi(n - 1, via, from, to);
    }
}
