import java.io.*;
import java.util.*;

public class NMandK1_18290 {
    public static int[][] arr;
    public static int[][] chikaku;
    public static int[] result;

    public static int N;
    public static int M;
    public static int K;

    public static int max = Integer.MIN_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        arr = new int[N][M];
        chikaku = new int[N][M];
        result = new int[K];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        solution(0);

        System.out.println(max);
    }

    private static void solution(int start) {

        if (start == K) {
            int temp = 0;
            for (int i : result) {
                temp += i;
            }
            max = Math.max(max, temp);
        } else {
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    if (chikaku[i][j] > 0)
                        continue;
                    go(i, j);
                    result[start] = arr[i][j];
                    solution(start + 1);
                    back(i, j);
                }
            }
        }
    }

    private static void go(int x, int y) {
        chikaku[x][y]++;
        if (y - 1 >= 0) {
            chikaku[x][y - 1]++;
        }
        if (x - 1 >= 0) {
            chikaku[x - 1][y]++;
        }
        if (y + 1 < M) {
            chikaku[x][y + 1]++;
        }
        if (x + 1 < N) {
            chikaku[x + 1][y]++;
        }
    }

    private static void back(int x, int y) {
        chikaku[x][y]--;
        if (y - 1 >= 0) {
            chikaku[x][y - 1]--;
        }
        if (x - 1 >= 0) {
            chikaku[x - 1][y]--;
        }
        if (y + 1 < M) {
            chikaku[x][y + 1]--;
        }
        if (x + 1 < N) {
            chikaku[x + 1][y]--;
        }
    }
}
