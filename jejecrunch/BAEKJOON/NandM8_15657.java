import java.io.*;
import java.util.*;

public class NandM8_15657 {
    public static int[] arr;
    public static int[] result;
    public static int N;
    public static int M;
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[N];
        result = new int[M];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        dfs(0, 0);

        System.out.println(sb);
    }

    public static void dfs(int start, int cnt) {
        if (cnt == M) {
            for (int val : result) {
                sb.append(val + " ");
            }
            sb.append("\n");
        } else {
            for (int i = start; i < N; i++) {
                result[cnt] = arr[i];
                dfs(i, cnt + 1);
            }
        }

    }
}
