import java.util.*;

class Solution {
    public int[] solution(int n, int s) {
        int[] answer = {};

        if (n > s)
            answer = new int[] { -1 };
        else {
            answer = new int[n];
            for (int i = 0; i < n; i++) {
                answer[i] = s / n;
            }

            for (int i = 0; i < s % n; i++) {
                answer[i]++;
            }

            Arrays.sort(answer);
        }

        return answer;
    }
}