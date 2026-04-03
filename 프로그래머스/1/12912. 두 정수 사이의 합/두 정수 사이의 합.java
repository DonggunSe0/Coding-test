class Solution {
    public long solution(int a, int b) {
        long min = a;
        long max = b;
        long answer = 0;
        
        if(a == b){
            answer = a;
        }else if(a < b){
            for(long i = min; i<=max; i ++){
                answer+=i;
            }
        }else{
            min = b;
            max = a;
            for(long i = min; i<=max; i ++){
                answer+=i;
            }
        }

        return answer;
    }
}