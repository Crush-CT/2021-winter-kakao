import java.util.*;

public class Remote_1107 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt(); // 채널
        int M = scan.nextInt(); // 고장난 버튼 개수
        boolean[] remote = new boolean[10]; // 고장난 버튼
        for (int i = 0; i < M; i++) {
            int broken = scan.nextInt();
            remote[broken] = true;
        }

        int result = Math.abs(N - 100);
        for (int i = 0; i <= 999999; i++) {
            String str = String.valueOf(i);
            int len = str.length();

            boolean isBreak = false;
            for (int j = 0; j < len; j++) {
                if (remote[str.charAt(j) - '0']) {
                    isBreak = true;
                    break;
                }
            }
            if (!isBreak) {
                int min = Math.abs(N - i) + len;
                result = Math.min(min, result);
            }
        }

        System.out.println(result);
    }
}
