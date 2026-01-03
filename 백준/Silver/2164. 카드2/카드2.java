import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		ArrayDeque<Integer> dq = new ArrayDeque<Integer>();
		
		
		for(int i = 1; i < N+1; i++) {
			dq.offer(i);
		}
		
		
		
		while(dq.size() > 1) {
			dq.poll();
			dq.offer(dq.poll());
		}
		
		System.out.println(dq.poll());
		
		
	}
}

	
