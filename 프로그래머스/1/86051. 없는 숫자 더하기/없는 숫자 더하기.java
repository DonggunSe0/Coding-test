class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        for(int i = 1; i < 10; i ++){
            boolean found = false;
            for(int j = 0; j <numbers.length; j++ ){
                if(i == numbers[j]){
                    found = true;
                    break;
                }
            }
            if(!found){
                answer += i;
            }
        }
        return answer;
    }
}