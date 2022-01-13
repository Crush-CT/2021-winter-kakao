import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        
        answer = remove_value(arr);
        
        return answer;
    }
    
    private int find_min_index(int[] arr){
        int temp = Integer.MAX_VALUE;
        int result = 0;
        
        for(int i=0;i<arr.length;i++){
            if(temp > arr[i]){
                temp=arr[i];
                result = i;
            }
        }
        
        return result;
    }
    
    private int[] remove_value(int[] arr){
        int[] result = new int[arr.length-1];
        int min_idx = 0;
        
        if(arr.length == 1){
            result = new int[]{-1};
        } else {
            min_idx=find_min_index(arr);
            
            if(min_idx == arr.length - 1){
                System.arraycopy(arr, 0, result, 0, min_idx);
            } else {
                int remainingElements = arr.length - ( min_idx + 1 );
                System.arraycopy(arr, 0, result, 0, min_idx);
                System.arraycopy(arr, min_idx + 1, result, min_idx, remainingElements);
            }
            
        }
        
        return result;
    }
}