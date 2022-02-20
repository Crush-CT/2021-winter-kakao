import java.io.*;
import java.util.*;

public class NandM6_15655 {
    public static int[] arr;
    public static int[] result;
    public static boolean[] visit;
    public static int N;
    public static int M;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[N];
        result = new int[M];
        visit = new boolean[N + 1];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        dfs(0, 0);

    }

    public static void dfs(int start, int cnt) {
        if (cnt == M) {
            for (int val : result) {
                System.out.print(val + " ");
            }
            System.out.println();
        } else {
            for (int i = start; i < N; i++) {
                if (!visit[i]) {
                    visit[i] = true;
                    result[cnt] = arr[i];
                    dfs(i + 1, cnt + 1);
                    visit[i] = false;
                }
            }
        }

    }
}
