import java.io.*;
import java.util.*;

public class SortLocation_11650 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][2];

        for (int i = 0; i < n; i++) {
            String[] temp = br.readLine().split(" ");

            arr[i][0] = Integer.parseInt(temp[0]);
            arr[i][1] = Integer.parseInt(temp[1]);
        }

        Arrays.sort(arr, (o1, o2) -> {
            if (o1[0] == o2[0]) {
                return Integer.compare(o1[1], o2[1]);
            }
            return Integer.compare(o1[0], o2[0]);
        });

        for (int i = 0; i < n; i++) {
            if (i == n - 1) {
                sb.append(arr[i][0] + " " + arr[i][1]);
            } else {
                sb.append(arr[i][0] + " " + arr[i][1]).append("\n");
            }
        }

        System.out.println(sb);
    }
}
