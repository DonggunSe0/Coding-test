package Programmers;

class 콜라츠추측 {
    public int solution(int num) {
        int count = 0;
        int answer = collatz((long)num,count);
        return answer;
    }

    public int collatz(long num, int count){
        if (count ==500){
            return -1;
        }

        if(num ==1) return count;
        else if(num %2 == 0) {
            num = num /2;
            count ++;
            return collatz(num,count);
        }

        else {
            num = num*3+1;
            count++;
            return collatz(num,count);
        }
    }
}
