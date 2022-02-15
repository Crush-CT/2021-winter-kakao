import java.io.*;
import java.util.*;

public class CandyGame_3085 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        char[][] board = new char[N][N];

        for (int i = 0; i < N; i++) {
            board[i] = br.readLine().toCharArray();
        }

        int MAX = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (j + 1 < N) {
                    char t = board[i][j];
                    board[i][j] = board[i][j + 1];
                    board[i][j + 1] = t;
                    int temp = check(board);
                    if (MAX < temp)
                        MAX = temp;
                    t = board[i][j];
                    board[i][j] = board[i][j + 1];
                    board[i][j + 1] = t;
                }

                if (i + 1 < N) {
                    char t = board[i][j];
                    board[i][j] = board[i + 1][j];
                    board[i + 1][j] = t;
                    int temp = check(board);
                    if (MAX < temp)
                        MAX = temp;
                    t = board[i][j];
                    board[i][j] = board[i + 1][j];
                    board[i + 1][j] = t;
                }
            }
        }

        System.out.println(MAX);
    }

    private static int check(char[][] board) {
        int res = 1;
        for (int i = 0; i < board.length; i++) {
            int cnt = 1;
            for (int j = 1; j < board[i].length; j++) {
                if (board[i][j] == board[i][j - 1]) {
                    cnt += 1;
                } else {
                    cnt = 1;
                }

                if (res < cnt)
                    res = cnt;
            }

            cnt = 1;
            for (int j = 1; j < board[i].length; j++) {
                if (board[j][i] == board[j - 1][i]) {
                    cnt += 1;
                } else {
                    cnt = 1;
                }

                if (res < cnt)
                    res = cnt;
            }
        }

        return res;
    }
}
