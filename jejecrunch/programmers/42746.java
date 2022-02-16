import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        String result = "";

        String[] temp = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            temp[i] = Integer.toString(numbers[i]);
        }

        Arrays.sort(temp, new Comparator<String>() {
            public int compare(String o1, String o2) {
                return (o2 + o1).compareTo(o1 + o2);
            }
        });

        for (String a : temp) {
            result += a;
        }

        char[] result_arr = result.toCharArray();
        boolean check = false;

        for (char a : result_arr) {
            if (a != '0') {
                check = false;
                break;
            } else {
                check = true;
            }
        }

        if (check)
            return "0";

        return result;
    }
}