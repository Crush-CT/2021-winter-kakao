import java.util.*;

public class Statistics_2108 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int[] arr = new int[N];
        List<Integer> temp2 = new ArrayList<>();
        temp2.add(0 - 4000);
        int[] cnt = new int[8002];
        double total = 0;
        int aver = 0, center = 0, max = 0, max_r = 0, range = 0;

        for (int i = 0; i < N; i++) {
            int temp = scan.nextInt();
            arr[i] = temp;
            cnt[temp + 4000]++;
            total += temp;
        }

        max = cnt[0];
        for (int i = 1; i < cnt.length; i++) {
            if (max == cnt[i]) {
                temp2.add(i - 4000);
            } else if (cnt[i] > max) {
                max = cnt[i];
                temp2.clear();
                temp2.add(i - 4000);
            }
        }

        if (temp2.size() > 1) {
            Collections.sort(temp2);
            max_r = temp2.get(1);
        } else {
            max_r = temp2.get(0);
        }

        Arrays.sort(arr);
        aver = (int) Math.round(total / N);
        center = arr[N / 2];
        range = Math.abs(arr[0] - arr[N - 1]);

        System.out.println(aver); // 산술평균
        System.out.println(center); // 중앙값
        System.out.println(max_r); // 최빈값
        System.out.println(range); // 범위
    }
}
