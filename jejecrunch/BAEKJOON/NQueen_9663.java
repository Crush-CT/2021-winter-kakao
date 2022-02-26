import java.util.*;
import java.io.*;

public class NQueen_9663 {
    public static int[] map;
    public static int count = 0;
    public static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        map = new int[N];

        dfs(0);
        System.out.println(count);
    }

    private static void dfs(int depth) {
        if (depth == N) {
            count++;
            return;
        }

        for (int i = 0; i < N; i++) {
            map[depth] = i;
            if (check(depth)) {
                dfs(depth + 1);
            }
        }
    }

    private static boolean check(int col) {
        for (int i = 0; i < col; i++) {
            if (map[col] == map[i]) {
                return false;
            }

            else if (Math.abs(col - i) == Math.abs(map[col] - map[i])) {
                return false;
            }
        }
        return true;
    }
}
