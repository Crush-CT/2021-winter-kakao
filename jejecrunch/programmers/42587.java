import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;

        Queue<Priority> queue = new LinkedList<>();

        for (int i = 0; i < priorities.length; i++) {
            queue.add(new Priority(i, priorities[i]));
        }

        int now = 0;

        while (!queue.isEmpty()) {
            Priority cur = queue.poll();
            boolean flag = false;
            for (Priority p : queue) {
                if (p.value > cur.value) {
                    flag = true;
                }
            }

            if (flag) {
                queue.add(cur);
            } else {
                now++;
                if (cur.key == location) {
                    answer = now;
                    break;
                }
            }
        }

        return answer;
    }

    class Priority {
        int key;
        int value;

        public Priority(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }
}