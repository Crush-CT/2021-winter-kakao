import java.io.*;

public class NewNumber1_1748 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String num = br.readLine();
        int len = num.length();
        int N = Integer.parseInt(num);

        int temp = 9;
        int result = 0;

        for (int i = 1; i < len; i++) {
            result += i * temp;
            temp *= 10;
        }

        int last = (int) (N - Math.pow(10, len - 1) + 1) * len;
        result += last;
        System.out.println(result);
    }
}
