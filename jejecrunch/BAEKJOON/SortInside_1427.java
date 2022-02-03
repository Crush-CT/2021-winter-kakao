import java.util.*;

public class SortInside_1427 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String n = scan.nextLine();
        String[] N = n.split("");

        Arrays.sort(N, Collections.reverseOrder());

        for (int i = 0; i < N.length; i++) {
            System.out.print(N[i]);
        }
    }
}
