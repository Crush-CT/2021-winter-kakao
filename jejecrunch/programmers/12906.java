import java.util.*;

public class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        int j = 0;
        
        ArrayList<Integer> list = new ArrayList<>();
        list.add(arr[0]);
        
        for(int i=1;i<arr.length;i++){
            if(arr[j] != arr[i]){
                list.add(arr[i]);
            }
            j++;
        }
        
        answer = list.stream().mapToInt(i->i).toArray();

       
        
        return answer;
    }
}