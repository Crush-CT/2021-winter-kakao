class Solution {
    public String solution(String s, int n) {
        String answer = "";
        String 대문자="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String 소문자="abcdefghijklmnopqrstuvwxyz";
        
        for(int i=0;i<s.length();i++){
            if(대문자.indexOf(s.charAt(i)) > -1){
                int index = (대문자.indexOf(s.charAt(i))+n)%(대문자.length());
                
                answer = answer.concat(Character.toString(대문자.charAt(index)));
            } else if(소문자.indexOf(s.charAt(i)) > -1) {
                int index = (소문자.indexOf(s.charAt(i))+n)%(소문자.length());
                
                answer = answer.concat(Character.toString(소문자.charAt(index)));
            } else {
                answer = answer.concat(Character.toString(s.charAt(i)));
            }
        }
        
        return answer;
    }
}