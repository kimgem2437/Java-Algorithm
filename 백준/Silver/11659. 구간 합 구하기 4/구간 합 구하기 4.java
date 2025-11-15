import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	static int N;
	static int M;
	static int[] num;
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N= Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		num = new int[N+1];
		
		st = new StringTokenizer(br.readLine());
		for(int i = 1 ; i <= N; i++) {
			num[i] = num[i-1] + Integer.parseInt(st.nextToken());
		}
		
			for(int T = 1; T <=M; T++) {
				
			st = new StringTokenizer(br.readLine());
			int i = Integer.parseInt(st.nextToken());
			int j = Integer.parseInt(st.nextToken());
			
			int sum = num[j] - num[i-1];
			
		
			
			sb.append(sum).append("\n");
			
			
			}// M번까지 반복
			
			System.out.println(sb);
	} //main
}
