import java.util.*;

class Solution {
    public int findKthLargest(int[] nums, int k) {
        //배열에서 k번째로 큰 수 찾기
        //우선 순위큐 활용 
        //정렬 메서드 이용 
        int n = nums.length;
        
        Arrays.sort(nums); //ascended order
        int answer = nums[n - k]; //Return 안에서 변수 선언 불가
        return answer;

        
    }
}