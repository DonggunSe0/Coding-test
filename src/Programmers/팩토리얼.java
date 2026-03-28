package Programmers;

class 팩토리얼 {
    public int solution(int n) {
        int answer = 1;
        int factorialResult = 1;
        while (factorialResult <= n) {
            answer++; // 0! 1!이 이미 계산 되었다고 생각하고 2부터 시작
            factorialResult = factorial(answer);
        }

        return answer-1;
    }

    public int factorial(int n){
        if(n == 1) return 1;
        else return n*factorial(n-1);
    }
}
