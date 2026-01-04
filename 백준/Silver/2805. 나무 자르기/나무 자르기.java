import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int[] wood = new int[N]; 
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) {
			wood[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(wood);
		
		int min = 0;
		int max = wood[N-1];
		
		int result = 0;
		
		while(min <= max) {
			int mid = (min +max)/2;
			
			long sum = 0;
			
			
			for(int i = 0; i < N; i++) {
				if(wood[i] > mid) {
					sum += wood[i] - mid;
				}
			}
			
			if(sum >= M) {
				result = mid;
				min = mid + 1;
			} else {
				max = mid - 1;
			}
			
		}
		
		System.out.println(result);
		
		
	}
}
