import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for(int i=0;i<commands.length;i++){
            // 자르고 정렬 후 값 얻기
            answer[i] = get_values(array, commands[i]);
        }
        
        return answer;
    }
    
    private int get_values(int[] arr, int[] command){
        List<Integer> 자른배열 = new ArrayList<>();
        
        for(int i=command[0]-1;i<command[1];i++){
            자른배열.add(arr[i]);
        }
        
        Collections.sort(자른배열);
        
        return 자른배열.get(command[2]-1);
    }
}