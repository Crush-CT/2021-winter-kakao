import java.util.*;

class Solution {
    public String[] solution(String[] files) {
        String[] answer = files;

        Arrays.sort(answer, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                String HEAD1 = s1.split("[0-9]")[0].toLowerCase();
                String HEAD2 = s2.split("[0-9]")[0].toLowerCase();

                int result = HEAD1.compareTo(HEAD2);
                if (result == 0) {
                    result = findNumber(s1, HEAD1) - findNumber(s2, HEAD2);
                }

                return result;
            }
        });

        return answer;
    }

    private int findNumber(String s, String head) {
        s = s.substring(head.length());
        String result = "";

        for (char c : s.toCharArray()) {
            if (Character.isDigit(c) && result.length() < 5) {
                result += c;
            } else
                break;
        }

        return Integer.parseInt(result);
    }
}