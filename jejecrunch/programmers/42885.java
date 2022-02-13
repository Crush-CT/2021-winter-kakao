import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;

        Arrays.sort(people);

        Deque<Integer> list = new ArrayDeque<Integer>();
        for (int a : people) {
            list.addFirst(a);
        }

        while (list.size() != 0) {
            int a = list.removeFirst();
            if (list.size() != 0 && a + list.getLast() <= limit)
                list.removeLast();
            answer++;
        }

        return answer;
    }
}