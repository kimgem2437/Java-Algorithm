import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		if(N < K || K < 0) {
			System.out.println("0");
		} else {
			int result = bc(N) / (bc(K) * bc(N - K));
			System.out.println(result);
		}
		
	}
	
	static int bc(int n) {
		
		if(n == 0) {
			return 1;
		}
		
		int tmp = 1; 
		for(int i = 1; i <= n; i++) {
			tmp *= i;
			
		}
		return tmp;
		
	}
}
