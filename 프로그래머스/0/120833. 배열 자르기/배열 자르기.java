import java.util.*;

class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        List<Integer> list = new ArrayList<>();
    
        
        //list에 num1 - num2까지 삽입
        for(int i = num1; i <= num2; i ++){
            list.add(numbers[i]);
        }
        
        int[] answer = new int[list.size()];
        
        //answer배열에 리스트 원소 삽입
        for(int i = 0; i <list.size(); i ++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}