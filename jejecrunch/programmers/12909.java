// 2차
import java.util.*;

class Solution {
    boolean solution(String s) {
        int count = 0;

        for (int i=0;i<s.length();i++){
            if (count == 0){
                if (s.charAt(i) == '(') count++;
                else return false;
            } else {
                if (s.charAt(i) == ')') count--;
                else count++;
            }

            if (count > s.length() - i) return false;
        }

        return count == 0;
    }
}