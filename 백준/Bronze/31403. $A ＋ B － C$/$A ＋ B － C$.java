import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		
		String A = br.readLine();
		String B = br.readLine();
		String C = br.readLine();
		
		int result = Integer.parseInt(A) + Integer.parseInt(B) - Integer.parseInt(C);
		
		sb.append(result).append('\n');
		
		int result2 = Integer.parseInt(A+B) - Integer.parseInt(C);
		
		sb.append(result2);
		System.out.println(sb);
	}
}
