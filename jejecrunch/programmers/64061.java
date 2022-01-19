import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> bucket = new Stack<>();
        
        for(int idx=0;idx<moves.length;idx++){
            int result = 0;
            for(int a=0;a<board.length;a++){
                result = board[a][moves[idx]-1];
                if(board[a][moves[idx]-1] != 0){
                    board[a][moves[idx]-1] = 0;
                    break;
                }
            }
            
            if(result != 0) {
                if(!bucket.empty() && bucket.peek() == result) {
                    bucket.pop();
                    answer++;
                } else
                    bucket.push(result);
            }
        }
        
        answer *=2;
        return answer;
    }
}