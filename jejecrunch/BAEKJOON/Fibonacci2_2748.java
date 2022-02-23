import java.io.*;

public class Fibonacci2_2748 {
    public static long[] map = new long[91];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        System.out.println(fibonacci(num));
    }

    private static long fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else if (map[n] != 0) {
            return map[n];
        } else {
            return map[n] = fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
