import java.util.*;

class Solution {
    public int solution(int[][] maps) {
        //최단거리 => BFS 이용
        //1번 맵의 크기를 일단 알아야해
        int n = maps.length;
        int m = maps[0].length;
        //상 하 좌 우 이동을 해야해
        int[] moveX = {-1,1,0,0};
        int[] moveY = {0,0,-1,1};
        
        Queue<int[]> q = new ArrayDeque<>();
        int[] start = {0,0};
        q.offer(start);
        //해당 이동이 범위를 벗어나지 않는지 확인해야해
        while(!q.isEmpty()){
             //해당 이동이 범위를 벗어나지 않는지 확인해야해
            int[] current = q.poll();
            int x = current[0];
            int y = current[1];
            
            for(int i = 0; i<4; i++){
                int nx = x + moveX[i];
                int ny = y + moveY[i];
                
                if(nx<0|| nx >= n||ny<0||ny>=m){
                    continue;
                }
                  //해당 숫자가 1이 아니라면 이미 방문했거나 벽인 곳이라는 뜻이니까
                if(maps[nx][ny] !=1 ){
                    continue;
                }
                
                maps[nx][ny] = maps[x][y] + 1;
                    
                q.offer(new int[]{nx, ny});
            }
            
        }
        if(maps[n-1][m-1] == 1){
            return -1;
        }
        
        //해당 숫자가 1이 아니라면 이미 방문했거나 벽인 곳이라는 뜻이니까
        //이동 -> 이동한 자리를 저장
        //반복문으로 돌아가서 
        //만약에 반복문이 끝났는데 map[n-1][m-1] 여전히 1이라면 도착 불가니까 return -1
        
        return maps[n - 1][m - 1];
    }
}