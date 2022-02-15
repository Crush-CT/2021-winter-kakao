import java.io.*;
import java.util.*;

public class SumDivisor2_17427 {
    public static long fx[] = new long[1000001]; // 해당 자연수의 모든 약수를 더한 변수.
    public static long gx[] = new long[1000001]; // 해당 자연수 이하의 모든 fx값을 더한 변수.

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        f();
        g();

        int N = Integer.parseInt(br.readLine()); // 자연수 N

        System.out.println(gx[N]);
    }

    private static void f() {
        Arrays.fill(fx, 1);

        for (int i = 2; i < fx.length; i++) {
            for (int j = 1; i * j < fx.length; j++) {
                fx[i * j] += i;
            }
        }
    }

    private static void g() {
        for (int i = 1; i < gx.length; i++) {
            gx[i] += gx[i - 1] + fx[i];
        }
    }
}
