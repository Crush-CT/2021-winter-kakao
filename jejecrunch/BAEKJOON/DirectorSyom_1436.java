import java.util.Scanner;

public class DirectorSyom_1436 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // 입력 : n
        int n = scan.nextInt();
        int result = 0;
        int count = 0;

        for (int i = 0; count < n; i++) {
            if (Integer.toString(i).contains("666")) {
                ++count;
            }

            result = i;
        }

        // 출력 : n번째 영화의 제목에 들어간 수
        System.out.println(result);
    }
}
