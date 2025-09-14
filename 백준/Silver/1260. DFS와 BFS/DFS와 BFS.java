import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	static int N;
	static int M;
	static int V;
	static List<Integer>[] graph;
	static boolean[] visited;
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		V = Integer.parseInt(st.nextToken());
		
		graph = new ArrayList[N + 1];
		for(int i = 0; i < N + 1; i++) {
			graph[i] = new ArrayList<>();
		}
		
		for(int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			
			int u = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			
			graph[u].add(v);
			graph[v].add(u);
			
		}
		
		for(int i = 1; i < N+1; i++) {
			Collections.sort(graph[i]);
		}
		
		visited = new boolean[N + 1];
		dfs(V);
		sb.append("\n");
		
		visited = new boolean[N + 1];
		bfs(V);
		System.out.println(sb);
		
		
	}
	
	static void dfs(int node) {
		
		visited[node] = true;
		sb.append(node).append(" ");
		
		int size = graph[node].size();
		
		for(int i = 0; i < size; i++) {
			int nextnode = graph[node].get(i);
			if(!visited[nextnode]) {
				
				dfs(nextnode);
				
				
			}
			
		}
	}
	
	static void bfs(int start) {
		Queue<Integer> q = new ArrayDeque<>();
		
		q.offer(start);
		visited[start] = true;
		sb.append(start).append(" ");
		
		while(!q.isEmpty()) {
			int curr = q.poll();
			
			int size = graph[curr].size();
			
			for(int i = 0; i < size; i++) {
				
				int next = graph[curr].get(i);
				
				if(!visited[next]) {
					q.offer(next);
					visited[next] = true;
					sb.append(next).append(" ");
				}
				
			}
			
		}
		
		
	}
	
}
