import java.util.Scanner;

public class BUDtoAD_18108 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // 입력 !! : 서기를 알고 싶은 불기연도
        int bud = scan.nextInt();

        // 출력 !! : 서기연도 변환한 값
        System.out.println(bud - 600 + 57);

        return;
    }
}
