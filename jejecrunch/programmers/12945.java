class Solution {
    public int solution(int n) {
        int answer = 0;
        
        answer = fibonacci(n)%1234567;
        
        return answer;
    }
    
    private int fibonacci(int i){
        int[] arr = new int[i+1];
        
        
        if(i==0){
            return 0;
        } else if(i==1){
            return 1;
        } else {
            arr[0] = 0;
            arr[1] = 1;
            
            for(int n=2;n<i+1;n++){
                arr[n] = arr[n-2]%1234567+arr[n-1]%1234567;
            }

            return arr[i];
        }
    }
}