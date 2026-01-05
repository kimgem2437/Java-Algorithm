import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	
	static ArrayList<Integer>[] graph;
	static boolean[] visited;
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		graph = new ArrayList[N+1];
		visited = new boolean[N+1];
		
		for(int i = 1; i <= N; i++) {
			graph[i] = new ArrayList<>();
		}
		
		for(int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int u = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			
			graph[u].add(v);
			graph[v].add(u);
		}

		int cnt = 0;
		
		for(int i = 1; i <= N; i++) {
			if(!visited[i]) {
				BFS(i);
				cnt++;
			}
		}
		
		System.out.println(cnt);
	} //main
	
	static void BFS(int start) {
		Queue<Integer> q = new LinkedList<>();
		
		q.offer(start);
		visited[start] = true;
		
		while(!q.isEmpty()) {
			int now = q.poll();
			
			for(int next : graph[now]) {
				if(!visited[next]) {
					visited[next] = true;
					q.offer(next);
				}
				
			}
		}
	}
}
