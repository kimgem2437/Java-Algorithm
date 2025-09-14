import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        StringBuilder result = new StringBuilder();
        String digits = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        if (N == 0) {
            System.out.println(0);
            return;
        }

        while (N > 0) {
            result.append(digits.charAt(N % B));
            N /= B;
        }

        System.out.println(result.reverse().toString());
    }
}