import java.util.*;
import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        int min = arr[0];
        for(int i= 1 ;i<arr.length;i++){
            if(min>arr[i]){
                min = arr[i];
            }
        }
        
        for(int j=0; j<arr.length; j++){
            if(arr[j] != min){
                list.add(arr[j]);
            }
        }
        
        if(list.size()==0){
            return new int[]{-1};
        }
        
        int[] answer =new int[list.size()];
        for(int k = 0; k<list.size(); k++){
            answer[k] = list.get(k);
        }
        
        
        return answer;
    }
}