import java.util.Scanner;

public class Repaint_1018 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int min = 64;

        // 입력 : n m 정사각형의 크기
        int n = scan.nextInt();
        int m = scan.nextInt();
        boolean[][] chess = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            String str = scan.next();
            for (int j = 0; j < m; j++) {
                if (str.charAt(j) == 'W') {
                    chess[i][j] = true;
                } else {
                    chess[i][j] = false;
                }
            }
        }

        for (int i = 0; i < n - 7; i++) {
            for (int j = 0; j < m - 7; j++) {
                int count = 0;

                boolean temp = chess[i][j];

                for (int k = i; k < i + 8; k++) {
                    for (int l = j; l < j + 8; l++) {
                        if (chess[k][l] == temp) {
                            count++;
                        }

                        temp = (!temp);
                    }
                    temp = (!temp);
                }

                count = Math.min(count, 64 - count);
                min = Math.min(min, count);
            }
        }

        // 출력 : 다시 칠해야하는 정사각형 개수의 최솟값
        System.out.println(min);
    }

}
