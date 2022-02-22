import java.io.*;
import java.util.*;

public class NandM11_15665 {
    public static int[] arr;
    public static int[] result;
    public static int N;
    public static int M;
    public static HashSet<String> set = new HashSet<>();
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

        dfs(0);

        System.out.println(sb);
    }

    public static void dfs(int cnt) {
        if (cnt == M) {
            StringBuilder temp = new StringBuilder();
            for (int val : result) {
                temp.append(val + " ");
            }

            if (!set.contains(temp.toString())) {
                sb.append(temp.toString() + "\n");
                set.add(temp.toString());
            }
            return;
        } else {
            for (int i = 0; i < N; i++) {
                result[cnt] = arr[i];
                dfs(cnt + 1);
            }
        }

    }
}
