import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        Queue<Integer> waiting = new LinkedList<>();
        Queue<Integer> bridge = new LinkedList<>();
        int sum = 0;
        
        for(int a : truck_weights){
            waiting.add(a);
        }
        
        for(int i=0;i<bridge_length;i++){
            bridge.add(0);
        }
        
        while(!bridge.isEmpty()){
            answer++;
            sum -= bridge.peek();
            bridge.remove();
            
            if(!waiting.isEmpty()){
                if(sum + waiting.peek() <= weight){
                    sum += waiting.peek();
                    bridge.add(waiting.peek());
                    waiting.remove();
                } else {
                    bridge.add(0);
                }
            }
        }
        
        return answer;
    }
}