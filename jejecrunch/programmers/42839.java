
// 3차 - 성공
import java.util.*;

class Solution {
    private HashSet<Integer> hash = new HashSet<>();

    public int solution(String numbers) {
        recursive("", numbers);
        return hash.size();
    }

    public void recursive(String comb, String others) {
        if (!comb.equals("") && isPrime(Integer.valueOf(comb)))
            hash.add(Integer.valueOf(comb));
        for (int i = 0; i < others.length(); i++)
            recursive(comb + others.charAt(i), others.substring(0, i) + others.substring(i + 1));
    }

    // 소수 찾기
    public static boolean isPrime(int num) {
        if (num == 0 || num == 1)
            return false;

        int lim = (int) Math.sqrt(num);

        for (int i = 2; i <= lim; i++)
            if (num % i == 0)
                return false;
        return true;
    }
}