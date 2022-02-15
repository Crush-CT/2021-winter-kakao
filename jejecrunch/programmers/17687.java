class Solution {
    public String solution(int n, int t, int m, int p) {
        String answer = "";
        String str = "01";
        String temp = "";
        int count = t * m;
        int num = 0;
        int a = 0;
        String b = "";

        for (int i = 2;; i++) {
            num = i;
            if (n == 2) { // 2진법
                str += Integer.toBinaryString(i);
                if (str.length() >= count)
                    break;
            } else if (n == 8) { // 8진법
                str += Integer.toOctalString(i);
                str = str.toUpperCase();
                if (str.length() >= count)
                    break;
            } else if (n == 16) { // 16진법
                str += Integer.toHexString(i);
                str = str.toUpperCase();
                if (str.length() >= count)
                    break;
            } else {
                while (num > 0) {
                    a = num % n;
                    if (a >= 10) {
                        if (a == 10)
                            b = "A";
                        if (a == 11)
                            b = "B";
                        if (a == 12)
                            b = "C";
                        if (a == 13)
                            b = "D";
                        if (a == 14)
                            b = "E";
                        if (a == 15)
                            b = "F";
                    } else
                        b = Integer.toString(a);
                    temp = b + temp;
                    count--;
                    if (count == 0)
                        break;
                    num /= n;
                }
                str += temp;
                if (count <= 0)
                    break;
                temp = "";
            }
        }

        for (int i = 0; i < t; i++)
            answer += str.substring(p + m * i - 1, p + m * i);

        return answer;
    }
}