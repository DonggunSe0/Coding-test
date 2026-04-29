class 없는숫자더하기 {
    public int solution(int[] numbers) {
        int answer = 0;
        for(int i = 1; i < 10; i ++){
            boolean found = false; // numbers 배열에서 i가 있는지 확인하는 플래그
            for(int j = 0; j <numbers.length; j++ ){
                if(i == numbers[j]){
                    found = true; // i가 numbers 배열에 존재하면 found를 true로 설정하고 루프 종료
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