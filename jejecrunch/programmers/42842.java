class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = {};

        int total = brown + yellow;

        for (int i = 1; i <= total; i++) {
            int row = i;
            int col = total / i;

            if (row > col) {
                continue;
            }

            if ((row - 2) * (col - 2) == yellow) {
                answer = new int[] { col, row };
                break;
            }
        }
        return answer;
    }

}