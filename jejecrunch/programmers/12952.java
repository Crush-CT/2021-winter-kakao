import java.util.*;

class Solution {
    static int[] map;
    static int count = 0;

    public int solution(int n) {
        map = new int[n];

        dfs(0, n);

        return count;
    }

    private void dfs(int depth, int n) {
        if (depth == n) {
            count++;
            return;
        }

        for (int i = 0; i < n; i++) {
            map[depth] = i;
            if (check(depth)) {
                dfs(depth + 1, n);
            }
        }
    }

    private boolean check(int col) {
        for (int i = 0; i < col; i++) {
            if (map[col] == map[i]) {
                return false;
            }

            else if (Math.abs(col - i) == Math.abs(map[col] - map[i])) {
                return false;
            }
        }
        return true;
    }
}