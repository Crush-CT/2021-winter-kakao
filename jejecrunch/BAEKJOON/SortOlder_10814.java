import java.io.*;
import java.util.*;

public class SortOlder_10814 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        String[][] arr = new String[n][2];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            arr[i][0] = st.nextToken();
            arr[i][1] = st.nextToken();
        }

        Arrays.sort(arr, (o1, o2) -> {
            return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]);
        });

        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                sb.append(arr[i][0] + " " + arr[i][1]);
            } else {
                sb.append(arr[i][0] + " " + arr[i][1] + "\n");
            }
        }
        System.out.println(sb);
    }
}
