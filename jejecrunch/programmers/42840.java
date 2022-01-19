class Solution {
    public int[] solution(int[] answers) {
        int[] answer = {};
        int[] scores = new int[]{a_score(answers), b_score(answers),c_score(answers)};
        
        answer = compare(scores);
        
        return answer;
    }
    
    private int[] compare(int[] scores){
        int[] result = new int[3];
        System.out.println(scores[0]+" "+scores[1]+" "+scores[2]);
        
        if(scores[0] < scores[1]){
            if(scores[1] < scores[2]){ // 3
                result = new int[]{3};
                return result;
            } else if(scores[2] < scores[1]){ // 2
                result = new int[]{2};
                return result;
            } else if(scores[1] == scores[2]){ // 2, 3
                result = new int[]{2,3};
                return result;
            }
        } else if(scores[0] == scores[1]){
            if(scores[1] < scores[2]){ // 3
                result = new int[]{3};
                return result;
            } 
            else if(scores[1] > scores[2]) { // 1, 2
                result = new int[]{1,2};
                return result;
            } 
            else { // 1, 2, 3
                result = new int[]{1,2,3};
                return result;
            }
        } else if(scores[0] > scores[1]){
            if(scores[0] > scores[2]){ // 1
                result = new int[]{1};
                return result;
            } else if(scores[0] < scores[2]){ // 3
                result = new int[]{3};
                return result;
            } else if(scores[0] == scores[2]){ // 1, 3
                result = new int[]{1,3};
                return result;
            }
        }
        
        return result;
    }
    
    // 점수 내기 !
    private int a_score(int[] answers){
        int[] stand = new int[]{1,2,3,4,5};
        int score = 0;
        
        for(int i=0;i<answers.length;i++){
            if(stand[i%stand.length] == answers[i]) score++;
        }
        
        return score;
    }
    
    private int b_score(int[] answers){
        int[] stand = new int[]{2,1,2,3,2,4,2,5};
        int score = 0;
        
        for(int i=0;i<answers.length;i++){
            if(stand[i%stand.length] == answers[i]) score++;
        }
        
        return score;
    }
    
    private int c_score(int[] answers){
        int[] stand = new int[]{3,3,1,1,2,2,4,4,5,5};
        int score = 0;
        
        for(int i=0;i<answers.length;i++){
            if(stand[i%stand.length] == answers[i]) score++;
        }
        
        return score;
    }
}