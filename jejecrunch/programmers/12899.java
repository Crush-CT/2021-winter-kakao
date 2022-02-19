class Solution {
    public String solution(int n) {
        String answer = "";
        String[] numbers = new String[] { "4", "1", "2" };
        int num = n;

        while (num > 0) {
            int reminder = num % 3;
            num /= 3;

            if (reminder == 0)
                num--;

            answer = numbers[reminder].concat(answer);
        }

        return answer;
    }
}