import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	static int[][] safe;
	static boolean[][] visited;
	static int N;
	static int[] dr = {-1, 1, 0, 0};
	static int[] dc = {0, 0, -1, 1};
	static StringBuilder sb = new StringBuilder(); 

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		N = Integer.parseInt(br.readLine());

		safe = new int[N][N];
		int maxh = 0;

		for(int r = 0; r < N; r++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int c = 0; c < N; c++) {
				safe[r][c] = Integer.parseInt(st.nextToken());

				if(maxh < safe[r][c]) {
					maxh = safe[r][c];
				}
			}
		}

		int maxzone = 0;	
		
		for(int h = 0; h < maxh; h++) {
			visited = new boolean[N][N];
			int safezone = 0;
			
			for(int r = 0; r < N; r++) {
				for(int c = 0; c < N; c++) {
					
					if(safe[r][c] > h && !visited[r][c]) {
						bfs(r,c,h);
						safezone++;
					}
				}
			}
			
			maxzone = Math.max(maxzone, safezone);
		}
		
		if(maxzone == 0) {
			sb.append("1");
		} else {
			sb.append(maxzone);
		}
		
		System.out.println(sb);



	}
	
	public static void bfs(int r, int c, int h) {
		Queue<int[]> q = new ArrayDeque<>();
		q.offer(new int[]{r,c});
		visited[r][c] = true;
		
		while(!q.isEmpty()) {
			
			int[] curr= q.poll();
			int currR = curr[0];
			int currC = curr[1];
			
			for(int i = 0; i < 4; i++) {
				int nr = currR + dr[i];
				int nc = currC + dc[i];
				
				if(nr < 0 || nr >= N || nc < 0 || nc >= N) {
					continue;
				}
				
				if(visited[nr][nc] || safe[nr][nc] <= h) {
					continue;
				}
				
				visited[nr][nc] = true;
				q.offer(new int[] {nr,nc});
			}
			
		}
	}
}
