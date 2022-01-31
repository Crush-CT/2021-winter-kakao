import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class SortNumber2_2751 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        // 입력 : n개의 수
        int n = scan.nextInt();

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(scan.nextInt());
        }

        Collections.sort(list);

        for (int value : list) {
            sb.append(value).append('\n');
        }

        System.out.println(sb);
    }
}
