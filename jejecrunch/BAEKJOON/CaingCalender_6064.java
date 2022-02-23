import java.io.*;
import java.util.*;

public class CaingCalender_6064 {
    public static int[] result;
    public static int T, M, N, x, y;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        T = Integer.parseInt(br.readLine());
        result = new int[T];

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            M = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());
            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());

            result[i] = solution(M, N, x, y);
        }

        for (int i = 0; i < T; i++) {
            System.out.println(result[i]);
        }
    }

    private static int solution(int M, int N, int tx, int ty) {
        while (tx <= lcm(M, N)) {
            if ((tx - ty) % N == 0)
                return tx;
            tx += M;
        }
        return -1;
    }

    private static int gcd(int a, int b) {
        if (b == 0)
            return a;

        return gcd(b, a % b);
    }

    private static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }
}
