package Programmers;

public class 배열뒤집기 {
    public int[] solution(int[] num_list) {
        // 정답 배열 선언 return 배열
        int[] answer = new int[num_list.length];
        int a = answer.length -1; // 배열 인덱스 두개 비교 하기 위한

        for(int i =0; i < answer.length; i ++){
            answer[i] = num_list[a];
            a -= 1;
        }
        return answer;
    }
}
