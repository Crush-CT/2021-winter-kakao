import java.util.*;

class Solution {
    public int[] solution(long n) {
        int[] answer = {};
        int k = 0;
        long num = n;

        k = (int)(Math.log10(num)+1);
        answer = new int[k];

        for(int i=0; i<k; i++){
            answer[i] = (int)(num%10);
            num = num/10;
        }

        return answer;
    }
}