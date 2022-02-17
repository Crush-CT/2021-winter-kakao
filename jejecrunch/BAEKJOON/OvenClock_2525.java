import java.io.*;
import java.util.*;

public class OvenClock_2525 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());

        int si = Integer.parseInt(st.nextToken());
        int bun = Integer.parseInt(st.nextToken());
        int time = Integer.parseInt(br.readLine());

        if (bun + time >= 60) {
            si += (bun + time) / 60;
            bun = (bun + time) % 60;
        } else {
            bun = bun + time;
        }

        si = si % 24;

        sb.append(si + " " + bun);
        System.out.println(sb);
    }
}
