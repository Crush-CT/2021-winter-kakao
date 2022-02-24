import java.io.*;
import java.util.*;

public class Tetromino_14500 {
    public static int[][] arr;
    public static int N, M;
    static final int[][][] list = {
            { { 0, 0 }, { 0, 1 }, { 0, 2 }, { 0, 3 } },
            { { 0, 0 }, { 1, 0 }, { 2, 0 }, { 3, 0 } },
            { { 0, 0 }, { 0, 1 }, { 1, 0 }, { 1, 1 } },
            { { 0, 0 }, { 0, 1 }, { 0, 2 }, { 1, 2 } },
            { { 0, 0 }, { 0, 1 }, { 0, 2 }, { 1, 0 } },
            { { 1, 0 }, { 1, 1 }, { 1, 2 }, { 0, 2 } },
            { { 1, 0 }, { 1, 1 }, { 1, 2 }, { 0, 0 } },
            { { 0, 0 }, { 1, 0 }, { 2, 0 }, { 0, 1 } },
            { { 0, 0 }, { 0, 1 }, { 1, 1 }, { 2, 1 } },
            { { 0, 0 }, { 1, 0 }, { 2, 0 }, { 2, 1 } },
            { { 0, 1 }, { 1, 1 }, { 2, 1 }, { 2, 0 } },
            { { 0, 1 }, { 1, 1 }, { 1, 0 }, { 2, 0 } },
            { { 0, 0 }, { 1, 0 }, { 1, 1 }, { 2, 1 } },
            { { 0, 0 }, { 0, 1 }, { 1, 1 }, { 1, 2 } },
            { { 0, 1 }, { 0, 2 }, { 1, 0 }, { 1, 1 } },
            { { 0, 0 }, { 1, 0 }, { 1, 1 }, { 2, 0 } },
            { { 0, 1 }, { 1, 0 }, { 1, 1 }, { 2, 1 } },
            { { 0, 0 }, { 0, 1 }, { 0, 2 }, { 1, 1 } },
            { { 1, 0 }, { 1, 1 }, { 1, 2 }, { 0, 1 } } };

    public static int max = Integer.MIN_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[N][M];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int[][] one : list)
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    int sum = 0;
                    for (int k = 0; k < 4; k++) {
                        int row1 = i + one[k][0];
                        int col1 = j + one[k][1];
                        if (row1 >= N)
                            break;
                        if (col1 >= M)
                            break;
                        sum += arr[row1][col1];
                    }
                    max = Math.max(max, sum);
                }
            }
        System.out.println(max);
    }

}
