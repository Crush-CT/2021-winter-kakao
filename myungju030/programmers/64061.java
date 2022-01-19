import java.util.ArrayList;

public class Solution {
	 public static int solution(int[][] board, int[] moves) {
         int answer = 0;
         ArrayList<Integer> list = new ArrayList<Integer>();



            for(int j=0; j<moves.length; j++) {
               for(int i=0; i<board.length; i++) {
               if(board[i][moves[j]-1]!=0) {
                     if(list.size()-1 > 0 && list.get(list.size()-1)==board[i][moves[j]-1]) {
                        list.remove(list.size()-1);
                        answer += 2;
                        }
                     else {
                        list.add(board[i][moves[j]-1]);
                     }
                     board[i][moves[j]-1]=0;
                        break;
                  }

               }

         }


         return answer;
     }
}