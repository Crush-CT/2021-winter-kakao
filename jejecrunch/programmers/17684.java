import java.util.*;

class Solution {
    public ArrayList<Integer> solution(String msg) {
        HashMap<String, Integer> dictionary = new HashMap<>();
        ArrayList<Integer> answer = new ArrayList<>();
        int i = 1;
        boolean isEnd = false;

        for (; i <= 26; i++) {
            dictionary.put(String.valueOf((char) (i + 64)), i);
        }

        for (int j = 0; j < msg.length(); j++) {
            String cur = String.valueOf(msg.charAt(j));
            while (dictionary.containsKey(cur)) {
                j++;
                if (j == msg.length()) {
                    isEnd = true;
                    break;
                }
                cur += msg.charAt(j);
            }

            if (isEnd) {
                answer.add(dictionary.get(cur));
                break;
            }

            answer.add(dictionary.get(cur.substring(0, cur.length() - 1)));
            dictionary.put(cur, i++);

            j--;
        }

        return answer;
    }
}