import java.io.*;
import java.util.*;

public class DiceThree_2480 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        int total = 0;

        if (a == b && b == c) {
            total = 10000 + (a * 1000);
        } else if (a == b) {
            total = 1000 + (a * 100);
        } else if (b == c) {
            total = 1000 + (b * 100);
        } else if (c == a) {
            total = 1000 + (c * 100);
        } else {
            int max = Math.max(a, Math.max(b, c));
            total = max * 100;
        }

        System.out.println(total);
    }
}
