import java.util.*;
import java.lang.Math;

class Solution {
    public long solution(long n) {
        long answer = 0;
        ArrayList<Long> arrNum = new ArrayList<>();
        
        while(n > 0) { 
            arrNum.add(n%10); 
            n /= 10; 
        }
        
        Collections.sort(arrNum);
        
        int i=0;
        for(; i<arrNum.size(); i++){
            answer += (long) (arrNum.get(i) * Math.pow(10.0, i));
        }
        
        return answer;
    }
    
}