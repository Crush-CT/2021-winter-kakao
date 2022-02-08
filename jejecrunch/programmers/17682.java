class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        int[] arr = new int[3]; // 3번의 점수
        int index = 0;
        String temp = "";
        
        for(int i=0;i<dartResult.length();i++){
            switch(dartResult.charAt(i)){
                case '*':
                    arr[index - 1] *= 2;
                    if(index > 1) arr[index - 2] *= 2;
                    break;
                case '#':
                    arr[index - 1] *= (-1);
                    break;
                case 'S':
                    arr[index] = (int)Math.pow(Integer.parseInt(temp), 1);
                    index++;
                    temp = "";
                    break;
                case 'D':
                    arr[index] = (int)Math.pow(Integer.parseInt(temp), 2);
                    index++;
                    temp = "";
                    break;
                case 'T':
                    arr[index] = (int)Math.pow(Integer.parseInt(temp), 3);
                    index++;
                    temp = "";
                    break;
                default:
                    temp+=String.valueOf(dartResult.charAt(i));
                    break;
            }
        }
        
        for(int i=0;i<arr.length;i++){
            answer+=arr[i];
        }
        
        return answer;
    }
}