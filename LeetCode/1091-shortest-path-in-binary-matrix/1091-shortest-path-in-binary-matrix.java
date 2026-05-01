import java.util.*;

class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        //기존 문제와 다르게 방향이 8개다
        //matrix size
        int n = grid.length;
        int m = grid[0].length;

        if(grid[0][0] ==1 || grid[n-1][m-1] ==1){
            return -1;
        }


        //대각선 방향을 추가한다.
        int[] moveX = {-1, -1, -1, 0, 0, 1, 1, 1};
        int[] moveY = {-1, 0, 1, -1, 1, -1, 0, 1};

        //이동 방향에 대한 저장
        Queue<int[]> queue = new ArrayDeque<>();

        grid[0][0] = 1; //start

        //start point => {0,0}
        queue.offer(new int[]{0,0});

        while(!queue.isEmpty()){

            //get current point
            int[] current = queue.poll();

            int x = current[0];
            int y = current[1];

            //check wall or visited point for Next point
            for(int i = 0; i<8; i++){
                // 다음 위치 확인 벽인지 뭐인지
                int nx = x + moveX[i];
                int ny = y + moveY[i];

                //is it in range?
                if(nx < 0|| ny <0 || nx > n -1|| ny > m-1){
                    continue;
                }

                // checking wall or visited point
                if(grid[nx][ny]!=0){
                    continue;
                }

                grid[nx][ny] = grid[x][y] + 1;

                //save next point 
                queue.offer(new int[]{nx,ny});
            }


        }
        
        if(grid[n-1][m-1]== 0){
            return -1;
        }
      
        return grid[n-1][m-1];

    }
}