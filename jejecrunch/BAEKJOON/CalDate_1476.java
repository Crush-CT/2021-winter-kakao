import java.io.*;
import java.util.*;

public class CalDate_1476 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int e = 1, s = 1, m = 1;

        int E = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        for (int year = 1;; year++) {
            if (e == E && s == S && m == M) {
                sb.append(year);
                break;
            }
            e += 1;
            s += 1;
            m += 1;

            if (e == 16) {
                e = 1;
            }
            if (s == 29) {
                s = 1;
            }
            if (m == 20) {
                m = 1;
            }
        }

        System.out.println(sb);
    }
}
