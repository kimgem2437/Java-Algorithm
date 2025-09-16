import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		
		int num1 = N;
		int num2 = M;
		
		while(num2 != 0) {
			int tmp = num1%num2;
			num1 = num2;
			num2 = tmp;
		}
		int x = num1;
		
		

		int y = (N*M)/x;
		
		System.out.println(x);
		System.out.println(y);
	
	}
}
