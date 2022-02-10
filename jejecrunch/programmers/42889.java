import java.util.*;
import java.util.Map.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N+2];
        
        double[] players = new double[N+2]; // 스테이지에 도달한 플레이어 수
        double[] not_clear = new double[N+2]; // 스테이지에 도달했으나 아직 클리어하지 못한 플레이어의 수
        double[][] fault = new double[N+2][2]; // 실패율
        ArrayList<Integer> temp = new ArrayList<>();
        int t = 0;
        
        for(int i=0;i<stages.length;i++){
            not_clear[stages[i]]++;
        }
        
        for(int i=1;i<N+2;i++){
            for(int j=0;j<stages.length;j++){
                if(stages[j] >= i){
                    players[i]++;
                }
            }
        }
        
        for(int i=0;i<N+2;i++){
            fault[i][0] = t;
            if(players[i] != 0){
                fault[i][1] = not_clear[i]/players[i];
            } else {
                fault[i][1] = 0.0;
            }
            t++;
        }
        
        Arrays.sort(fault, (o1, o2) -> {
            if (o1[1] == o2[1]) {
                return Double.compare(o1[0], o2[0]);
            }
            return Double.compare(o2[1], o1[1]);
        });
        
        for(int i=0;i<N+2;i++){
            if(fault[i][0] != 0.0 && fault[i][0] != (double)N+1){
                temp.add((int)fault[i][0]);
            }
        }
        
        answer = temp.stream().mapToInt(i -> i).toArray();
        
        return answer;
    }
}