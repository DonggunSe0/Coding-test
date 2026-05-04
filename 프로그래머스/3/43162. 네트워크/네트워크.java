import java.util.*;

class Solution {
    public int solution(int n, int[][] computers) {
        int answer = 0;
        
        boolean[] visited = new boolean[n];
        
        //각 노드가 번호로 정보를 배열 형태 110 가지고 있을때
        //{false,false,false}
        for(int i = 0; i <n; i++){
            if(!visited[i]){
                dfs(i,n,computers,visited);
                answer ++;
            }
        }
        
        return answer;
    }
    public void dfs(int i, int n, int[][] computers, boolean[] visited){
        int current = i;
        visited[i] = true;
        
        for(int next = 0; next < n; next ++){
            if(computers[i][next] ==1 && !visited[next]){
                dfs(next,n,computers,visited);
            }
        }
        
    }

}