import java.util.*;

class Solution {
    static int answer = 0;

    public int solution(int[] numbers, int target) {
        dfs(numbers, 0, target, 0);

        return answer;
    }

    private void dfs(int[] numbers, int idx, int target, int sum) {
        if (idx == numbers.length) {
            if (sum == target)
                answer++;
            return;
        }

        sum += numbers[idx];
        dfs(numbers, idx + 1, target, sum);
        sum -= numbers[idx];
        sum += (-1 * numbers[idx]);
        dfs(numbers, idx + 1, target, sum);
    }
}