import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] croatia = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        String input = br.readLine();


        for (int i = 0; i < croatia.length; i++) {
            input = input.replaceAll(croatia[i], "a");
        }

        System.out.println(input.length());

    }
}