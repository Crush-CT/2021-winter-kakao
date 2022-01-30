import java.util.Scanner;

public class Decompose_2231 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // 입력 : 자연수 n
        int n = scan.nextInt();

        // 출력 : n의 가장 작은 생성자
        System.out.println(decompose(n));
    }

    private static int decompose(int n) {
        int i = 0;
        int total = 0;
        int result = 0;

        for (; i < n; i++) {
            total = sum(i);

            // 본인과 각 자릿수 합이 n이면
            if (i + total == n) {
                result = i;
                break;
            }
        }

        return result;
    }

    private static int sum(int n) {
        int temp = n;
        int result = 0;

        while (temp != 0) {
            result += temp % 10;
            temp /= 10;
        }

        return result;
    }
}
