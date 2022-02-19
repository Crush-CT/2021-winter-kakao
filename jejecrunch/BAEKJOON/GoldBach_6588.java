import java.io.*;

public class GoldBach_6588 {
    static final boolean prime[] = new boolean[1000001];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        initPrime();

        while (true) {
            int num = Integer.parseInt(br.readLine());
            boolean ok = false;
            if (num == 0)
                break;
            for (int i = 2; i <= num / 2; i++) {
                if (prime[i] && prime[num - i]) {
                    sb.append(num + " = " + i + " + " + (num - i) + "\n");
                    ok = true;
                    break;
                }
            }
            if (!ok)
                sb.append("Goldbach's conjecture is wrong.\n");

        }

        System.out.println(sb);
    }

    public static void initPrime() {
        for (int i = 2; i <= 1000000; i++) {
            prime[i] = true;
        }
        for (int i = 2; i <= 1000000; i++) {
            for (int j = i * 2; j <= 1000000; j += i) {
                if (!prime[j])
                    continue;
                prime[j] = false;
            }
        }
    }
}
