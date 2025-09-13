import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	static boolean visited[];
	static int time[];
	
	static int subin;
	static int brother;


	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		subin = Integer.parseInt(st.nextToken());
		brother = Integer.parseInt(st.nextToken());
		
		int max = 200000;
		visited = new boolean[max];
		time = new int[max];
		
		if(subin - brother == 0) {
			System.out.println(0);
		} else {
			bfs();
		}
		
	} //main 

	public static void bfs() {

		Queue<Integer> q = new ArrayDeque<>();

		q.offer(subin);
		
		visited[subin] = true;
		time[subin] = 0;
		
		
		while(!q.isEmpty()) {
			int curr = q.poll();
			
			if(curr == brother) { 
				System.out.println(time[curr]);
				return;
			}
			
			int[] move = {curr - 1, curr + 1, curr * 2};
			
			for(int next : move) {
				if(next >= 0 && next < visited.length && !visited[next]) {
					visited[next] = true;
					time[next] = time[curr] + 1;
					q.offer(next);
				}
			}
			
			
		}//while


	} //bfs
}
