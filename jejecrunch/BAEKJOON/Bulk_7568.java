import java.util.Scanner;

public class Bulk_7568 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] people = new int[][] { {} };

        // 입력 : 전체 사람의 수 n
        int n = scan.nextInt();
        people = new int[n][2];
        for (int i = 0; i < n; i++) {
            people[i][0] = scan.nextInt();
            people[i][1] = scan.nextInt();
        }

        // 출력 : 덩치 등수를 그 순서대로 첫 줄에 출력하기(공백 문자로 분리)
        cal(people);
    }

    private static void cal(int[][] people) {
        int[] result = new int[people.length];

        for (int i = 0; i < people.length; i++) {
            int[] temp = people[i];
            for (int j = 0; j < people.length; j++) {
                if (temp[0] < people[j][0] && temp[1] < people[j][1]) {
                    result[i] += 1;
                }
            }
        }

        for (int i = 0; i < result.length; i++) {
            if (i == result.length - 1) {
                System.out.print(++result[i]);
            } else {
                System.out.print(++result[i] + " ");
            }
        }
    }
}
