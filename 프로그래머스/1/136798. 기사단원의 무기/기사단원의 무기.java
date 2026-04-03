class Solution {
    public int solution(int number, int limit, int power) {
        int j = 0;
        int sum =0; //철의 무게
        int[] junSa = new int[number];
        int[] weapon = new int[number];
        
        //전사 모집
        for(int i = 1; i <= junSa.length; i++){
            junSa[j] = i;
            int plus = 0;
            //무기 수집
            for(int k =1; k*k<=junSa[j]; k++){
                if(junSa[j]%k ==0){
                    if(junSa[j]==k*k){
                        plus +=1;
                    }else{
                        plus+=2;
                    }
                }
            }
            //무기 제한 사항
            if(plus>limit){
                plus = power;
            }
            weapon[j] = plus;
            j++;
        }
        //철 무게 = 무기 공격력
        for(int weapons: weapon){
            sum+= weapons;
        }
        
        return sum;//철무게
    }
}