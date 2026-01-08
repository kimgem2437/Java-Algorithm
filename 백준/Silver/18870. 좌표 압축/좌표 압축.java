import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		
		
		int[] num = new int[N];
		int[] copy = new int[N];
		
		
		int cnt = 0;
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < N; i++) {
			
			num[i] = Integer.parseInt(st.nextToken());
			copy[i] = num[i];
		}
		
		Arrays.sort(copy);
		
		HashMap<Integer, Integer> rank = new HashMap<>();
		for(int i = 0; i < N; i++) {
			if(!rank.containsKey(copy[i])) {
				rank.put(copy[i], cnt++);
			}
		}
		
		for(int i = 0; i < N; i++) {
			sb.append(rank.get(num[i])).append(" ");
		}
		
		System.out.println(sb);
		
		
	}
}
