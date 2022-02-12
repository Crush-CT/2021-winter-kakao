class Solution {
    public int solution(int n) {
        int answer = 0;

        int n_count = count(Integer.toBinaryString(n));

        while (true) {
            n++;
            if (count(Integer.toBinaryString(n)) == n_count) {
                answer = n;
                break;
            }
        }

        return answer;
    }

    private int count(String s) {
        int count = 0;
        char[] temp = s.toCharArray();

        for (char ss : temp) {
            if (ss == '1') {
                count++;
            }
        }

        return count;
    }
}