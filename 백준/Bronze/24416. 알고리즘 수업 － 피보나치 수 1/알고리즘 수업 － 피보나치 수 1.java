import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		int dp = N;
		
		System.out.println(fibo(N) + " " + (dp - 2));
		
	}
	
	public static int fibo(int n) {
		if(n <= 2) {
			return 1;
		}
		
		return (fibo(n - 1) + fibo(n - 2));
		
	}
	
//	public static int fibonacci(int n) {
//		
//		if(n == 0) return 0;
//		if(n <= 2) return 1;
//		
//		int[] dp = new int[n + 1];
//		
//		dp[1] = 1;
//		dp[2] = 1;
//		
//		for(int i = 3; i <= n; i++) {
//			dp[i] = dp[i - 1] + dp[i - 2];
//		}
//		
//		return dp[n];
//		
//	}
}
