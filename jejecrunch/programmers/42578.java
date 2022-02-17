import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;

        HashMap<String, Integer> hash = new HashMap<>();

        for (int i = 0; i < clothes.length; i++) {
            String key = clothes[i][1];
            hash.put(key, hash.getOrDefault(key, 0) + 1);
        }

        for (Integer count : hash.values()) {
            answer *= (count + 1);
        }

        return answer - 1;
    }
}