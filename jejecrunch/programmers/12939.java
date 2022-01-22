class Solution {
    public String solution(String s) {
        String answer = "";
        int[] numbers = integer_arr(s);
        
        answer+=min_value(numbers)+" "+max_value(numbers);
        
        return answer;
    }
    
    private int[] integer_arr(String s){
        String[] s_arr = s.split(" ");
        int[] answer = new int[s_arr.length];
        
        for(int i=0;i<s_arr.length;i++){
            answer[i] = Integer.parseInt(s_arr[i]);
        }
        
        return answer;
    }
    
    private String min_value(int[] arr){
        int temp = Integer.MAX_VALUE;
        
        for(int i=0;i<arr.length;i++){
            if(temp > arr[i]){
                temp = arr[i];
            }
        }
        
        return String.valueOf(temp);
    }
    
    private String max_value(int[] arr){
        int temp = Integer.MIN_VALUE;
        
        for(int i=0;i<arr.length;i++){
            if(temp < arr[i]){
                temp = arr[i];
            }
        }
        
        return String.valueOf(temp);
    }
}