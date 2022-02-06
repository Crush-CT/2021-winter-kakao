class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        int l_num = 10; // '*' => 10
        int r_num = 12; // '#' => 12
        
        for(int i=0;i<numbers.length;i++){
            if(numbers[i] %3 == 1){
                answer+="L";
                l_num = numbers[i];
            } else if(numbers[i] %3==0 && numbers[i] != 0){
                answer+="R";
                r_num = numbers[i];
            } else if(numbers[i]%3==2 || numbers[i] == 0){
                // 더 가까운 위치 계산
                int left = getLength(numbers[i], l_num);
                int right = getLength(numbers[i], r_num);
                
                if(left < right) {
                    answer+="L";
                    l_num = numbers[i];
                } else if(right < left){
                    answer+="R";
                    r_num = numbers[i];
                } else {
                    if(hand.equals("right")){
                        answer += "R";
                        r_num = numbers[i];
                    } else if(hand.equals("left")){
                        answer += "L";
                        l_num = numbers[i];
                    }
                }
            }
        }
        
        return answer;
    }
    
    private static int getLength(int number, int before){
        int result = 0;
        
        number = number == 0? 11:number;
        before = before == 0? 11:before;
        
        int x = (before - 1) / 3;
        int y = (before - 1) % 3;
        int numberX = number / 3;
        int numberY = 1;
        
        result = Math.abs(x - numberX)+Math.abs(y-numberY);
        
        return result;
    }
}