import java.util.*;
import java.util.Map.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> 해시맵 = new HashMap<>();
        
        // 정렬
        Arrays.sort(participant);
        Arrays.sort(completion);
        
//         for(String s:participant) 해시맵.put(s, 해시맵.getOrDefault(s, 0)+1);
//         for(String s:completion) 해시맵.put(s, 해시맵.get(s) -1);
        
//         for(Entry<String, Integer> entry:해시맵.entrySet()){
//             if(entry.getValue() != 0) {
//                 answer = entry.getKey();
//                 break;
//             }
//         }
        
        
        for(int i=0; i<participant.length;i++) {
            String name = participant[i];
            if (해시맵.containsKey(name)) {
                int count = (int)해시맵.get(name);
                해시맵.put(name, ++count);                
            } else {    
                해시맵.put(name, 1);
            }
        }

        for(int i=0; i<completion.length;i++) {            
            int count = (int)해시맵.get(completion[i]);
            String name = completion[i];
            if (count == 1) {
                해시맵.remove(name);
            } else {                 
                해시맵.put(name, --count); 
            }  
        }    
        
        String temp = 해시맵.keySet().toString();
        answer = temp.substring(1, temp.length()-1);

        return answer;
    }
}