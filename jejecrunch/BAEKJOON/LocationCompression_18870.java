import java.io.*;
import java.util.*;

public class LocationCompression_18870 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        int[] sorted = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            arr[i] = sorted[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(sorted);

        HashMap<Integer, Integer> ranking = new HashMap<>();
        int rank = 0;

        for (int value : sorted) {
            if (!ranking.containsKey(value)) {
                ranking.put(value, rank);
                rank++;
            }
        }

        for (int key : arr) {
            sb.append(ranking.get(key) + " ");
        }

        System.out.println(sb);
    }
}
