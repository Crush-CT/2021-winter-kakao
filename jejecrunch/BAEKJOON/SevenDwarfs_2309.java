import java.util.*;

public class SevenDwarfs_2309 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        int total = 0;
        int a = 0, b = 0;

        for (int i = 0; i < 9; i++) {
            list.add(scan.nextInt());
            total += list.get(i);
        }

        Collections.sort(list);

        for (int i = 0; i < 8; i++) {
            for (int j = i + 1; j < 9; j++) {
                if (total - list.get(i) - list.get(j) == 100) {
                    a = i;
                    b = j;
                    break;
                }
            }
        }

        for (int i = 0; i < 9; i++) {
            if (i == a || i == b) {
                continue;
            }

            System.out.println(list.get(i));
        }

    }
}
