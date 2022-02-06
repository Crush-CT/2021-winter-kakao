import java.io.*;
import java.util.*;
import java.util.Map.*;

public class Words_1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            arr[i] = br.readLine();
        }

        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                if (s1.length() == s2.length()) {
                    return s1.compareTo(s2);
                }
                return s1.length() - s2.length();
            }
        });

        String[] result = Arrays.stream(arr).distinct().toArray(String[]::new);

        for (int i = 0; i < result.length; i++) {
            if (i == result.length - 1) {
                sb.append(result[i]);
            } else {
                sb.append(result[i] + "\n");
            }
        }
        System.out.println(sb);
    }
}
