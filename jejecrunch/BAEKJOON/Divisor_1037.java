import java.io.*;
import java.util.*;

public class Divisor_1037 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine()); // 진짜 약수의 개수 (50보다 작거나 같은 자연수)
        int[] arr = new int[N]; // 약수를 담는 배열
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);
        sb.append(arr[0] * arr[N - 1]);

        System.out.println(sb);
    }
}
