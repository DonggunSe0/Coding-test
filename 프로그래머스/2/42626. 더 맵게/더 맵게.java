import java.util.*;

class Solution {
    public int solution(int[] scoville, int k) {
        int answer = 0;// 계산 횟수
        int sum = 0;
        PriorityQueue<Integer> rank = new PriorityQueue<>();
        for(int i = 0 ; i < scoville.length; i++){
            int x = scoville[i];
            rank.offer(x);
        }
        
        //더하기 계산 및 비교
        while(rank.peek()<k){
            if(rank.size()<2) return -1; //노드가 1개인데 k보다 작은 겨우
            int min1 = rank.poll();
            int min2 = rank.poll(); //=> 노드가 1개일때 여기에서 오류가남
            int mixed = min1 + min2*2;
            sum+=mixed;
            rank.offer(mixed);
            answer +=1;
            if(rank.peek()>=k){ // 맨위가 노드가 최소이므로 k보다 크면 모든 노드의 숫자가 k보다 크다.
                break;
            }
            
        }
        
        return answer;
    }
}