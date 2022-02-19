import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> answerQueue = new LinkedList<>();
        ArrayList<Integer> answerArrayList = new ArrayList<>();
        int answerCount = 1;

        // Queue에 필요한 필요개발 일자 넣기
        for (int i = 0; i < progresses.length; i++) {
            answerQueue.offer((int) Math.ceil((double) (100 - progresses[i]) / speeds[i]));
        }

        // 기준값 지정
        int dayCount = answerQueue.poll();
        for (int i = 1; i < progresses.length; i++) {
            // 현재 값 지정
            int temp = answerQueue.poll();
            // 기준값 보다 현재값이 큰 경우, 배포할 수 없음.
            if (dayCount < temp) {
                answerArrayList.add(answerCount);
                answerCount = 1;
                dayCount = temp;
            } else {
                answerCount++;
            }
        }
        answerArrayList.add(answerCount);

        // 정답 기준에 맞춰 ArrayList를 배열로 변환
        int[] answer = answerArrayList.stream().filter(i -> i != 0).mapToInt(i -> i).toArray();
        return answer;
    }
}