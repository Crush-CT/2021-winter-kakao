import java.util.*;
import java.util.Map.Entry;
import java.util.regex.Pattern;

class Solution {
    static HashMap<String, Integer> A = new HashMap<>();
    static HashMap<String, Integer> B = new HashMap<>();
    static Map<String, Integer> gyo_map = new HashMap<>();

    public int solution(String str1, String str2) {
        int answer = 0;
        int gyo = 0;
        int hap = 0;

        for (int i = 0; i < str1.length() - 1; i++) {
            String temp = (str1.charAt(i) + "").concat(str1.charAt(i + 1) + "").toLowerCase();
            if (Pattern.matches("^[a-zA-Z]*$", temp)) {
                if (A.containsKey(temp)) {
                    hap += 1;
                    A.put(temp, A.get(temp) + 1);
                } else {
                    hap += 1;
                    A.put(temp, 1);
                }
            }
        }

        for (int i = 0; i < str2.length() - 1; i++) {
            String temp = (str2.charAt(i) + "").concat(str2.charAt(i + 1) + "").toLowerCase();
            if (Pattern.matches("^[a-zA-Z]*$", temp)) {
                if (B.containsKey(temp)) {
                    hap += 1;
                    B.put(temp, B.get(temp) + 1);
                } else {
                    hap += 1;
                    B.put(temp, 1);
                }
            }
        }

        for (Entry<String, Integer> b : B.entrySet()) {
            if (A.containsKey(b.getKey()) && !gyo_map.containsKey(b.getKey())) {
                if (b.getValue() > A.get(b.getKey())) {
                    gyo_map.put(b.getKey(), A.get(b.getKey()));
                } else {
                    gyo_map.put(b.getKey(), b.getValue());
                }
            }
        }

        for (Entry<String, Integer> g : gyo_map.entrySet()) {
            gyo += g.getValue();
        }

        hap -= gyo;

        if (hap == 0)
            answer = 65536;
        else
            answer = (int) Math.floor((gyo * 1.0 / hap) * 65536);

        return answer;
    }
}