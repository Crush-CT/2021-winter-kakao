class Solution {
    public int solution(int num) {
        int answer = 0;
        int temp = num;
        
        for(int i=0;i<500;i++){
            if(temp == 1) {
                break;
            } else if(temp != 1) {
                if(temp%2 == 0) {
                    temp /= 2;
                    ++answer;
                } else if(temp%2 == 1){
                    temp *= 3;
                    ++temp;
                    ++answer;
                }
            }
        }
        
        if(temp != 1){
            answer = -1;
        }
        
        return answer;
    }
}