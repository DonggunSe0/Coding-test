import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (list.isEmpty() || list.get(list.size() - 1) != arr[i]) {
                list.add(arr[i]);
            }
        }

        int[] answer = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
            
            
            
            
//         Deque<Integer> deq = new ArrayDeque<>();
        
//         for(int i = 0; i<arr.length; i++){
//             if(!deq.isEmpty() && arr[i] == deq.peekLast()){
//                 continue;
//             }else{
//                 deq.addLast(arr[i]);
//             }
//         }
        
//          int[] answer = new int[deq.size()];
        
//         for(int i = 0; i<answer.length; i++){
//             answer[i] = deq.pollFirst();
//         }

//         return answer;
//     }
}
}