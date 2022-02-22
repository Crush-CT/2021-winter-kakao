import java.util.Stack;

class Solution {    
    public String solution(String p) {
        String answer = "";
        
        if(correct(p)) answer = p; // 올바른 괄호 문자열이면 그대로 출력
        else {
            answer = separate(p);
        }
        
        return answer;
    }
    
    private String separate(String p){
        StringBuilder u = new StringBuilder();
        StringBuilder v = new StringBuilder();
        
        if(p.length() == 0) return "";
        
        int open = 0;
        for(int i=0;i<p.length();i++){
            if(p.charAt(i) == '('){
                open++;
            } else {
                open--;
            }
            
            if(open == 0){
                u.append(p.substring(0, i+1));
                v.append(p.substring(i+1, p.length()));
                
                if(correct(u.toString())){
                    u.append(separate(v.toString()));
                } else {
                    StringBuilder temp = new StringBuilder();
                    temp.append("(");
                    temp.append(separate(v.toString()));
                    temp.append(")");
                    temp.append(reverse(u.toString()));
                    return temp.toString();
                }
                
                break;
            }
        }
        
        return u.toString();
    }
    
    private String reverse(String u){
        StringBuilder result = new StringBuilder();
        
        for(int i=1;i<u.length() -1;i++){
            if(u.charAt(i) == '(') result.append(")");
            else result.append("(");
        }
        
        return result.toString();
    }
    
    private boolean correct(String p){
        int open = 0;
        
        if(p.charAt(0) == ')') return false;
        
        for(int i=0;i<p.length();i++){
            if(p.charAt(i) == '('){
                open++;
            } else {
                open--;
                if(open < 0) return false;
            }
        }
        
        return true;
    }
}