import java.util.Scanner;

public class SortNumber_2750 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // 입력 : n개의 수
        int n = scan.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        sort(arr);
    }

    private static void sort(int[] arr) {
        int i, j, key = 0;
        for (i = 1; i < arr.length; i++) {
            key = arr[i];
            for (j = i - 1; j >= 0 && arr[j] > key; j--) {
                arr[j + 1] = arr[j];
            }

            arr[j + 1] = key;
        }

        for (i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
