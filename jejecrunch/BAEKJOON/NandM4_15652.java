import java.io.*;
import java.util.*;

public class NandM4_15652 {
    public static int[] arr;
    public static boolean[] visit;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        arr = new int[M];
        visit = new boolean[N];
        dfs(N, M, 0, 0);

    }

    public static void dfs(int N, int M, int at, int depth) {
        if (depth == M) {
            for (int val : arr) {
                System.out.print(val + " ");
            }
            System.out.println();
            return;
        }

        for (int i = at; i < N; i++) {
            arr[depth] = i + 1;
            dfs(N, M, i, depth + 1);
        }
    }
}
