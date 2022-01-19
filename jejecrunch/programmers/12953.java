class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        int temp = 1;
        
        if(arr.length == 1){
            answer = arr[0];
        } else {
            for(int i=0;i<arr.length;i++){
                temp = lcm(temp, arr[i]);
            }

            answer = temp;
        }
        
        return answer;
    }
    
    // 최대공약수 재귀 방식
    private int gcd(int a, int b) {
        if(b == 0) return a;
        // GCD(a, b) = GCD(b, r)이므로 (r = a % b)
        return gcd(b, a % b);
    }

    // 최소공배수
    private int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }
}