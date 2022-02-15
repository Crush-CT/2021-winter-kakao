import java.io.*;
import java.util.*;

public class Sum_123_9095 {
    static int[] dp = new int[11];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        int[] N = new int[T];

        dp_init();

        for (int i = 0; i < T; i++) {
            N[i] = Integer.parseInt(br.readLine()); // 자연수 N
            sb.append(dp[N[i]] + "\n");
        }

        System.out.println(sb);
    }

    private static void dp_init() {
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;

        for (int i = 4; i < 11; i++) {
            dp[i] = dp[i - 3] + dp[i - 2] + dp[i - 1];
        }
    }
}
