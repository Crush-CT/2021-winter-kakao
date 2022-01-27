import java.util.Scanner;

public class Blackjack_2798 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int total = 0, before = 0;

        // 입력 !! : 카드 개수 n 과 m (최댓값 혹은 근사값)
        int n = scan.nextInt();
        int m = scan.nextInt();

        // 카드에 쓰여 있는 수
        int[] arrays = new int[n];
        for (int i = 0; i < n; i++) {
            arrays[i] = scan.nextInt();
        }

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    total = arrays[i] + arrays[j] + arrays[k];

                    if (before < total && total <= m) {
                        before = total;
                    }
                }
            }
        }

        System.out.println(before);

        return;
    }
}
