class Solution {
    int i = 0;

    public int[][] solution(int n) {
        int size = (int) Math.pow(2, n) - 1; // 옮긴 횟수
        int[][] answer = new int[size][2];

        f(1, 3, n, answer);

        return answer;
    }

    private void f(int from, int to, int n, int[][] answer) {
        if (n > 0) {
            f(from, 6 - (from + to), n - 1, answer);
            answer[i] = new int[] { from, to };
            i++;
            f(6 - (from + to), to, n - 1, answer);
        }
    }
}
