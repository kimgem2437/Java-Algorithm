import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	static class rc {
		int r, c, cnt;


		public rc(int r, int c, int cnt) {
			this.r = r;
			this.c = c;
			this.cnt = cnt;
		}
		
	}
	
	static int N, M;
	static char[][] map;
	static boolean[][] visited;
	static int[] dr = {-1, 1, 0, 0};
	static int[] dc = {0, 0, -1, 1};

	
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		map = new char[N][M];
		for(int i = 0; i < N; i++) {
			map[i] = br.readLine().toCharArray();
		}
		
		visited = new boolean[N][M];
		
		System.out.println(bfs(0, 0, 1));
		
	}
	
	 static int bfs(int r, int c, int cnt) {
		Queue<rc> q = new ArrayDeque<>();

		q.offer(new rc(r, c, cnt));
		
		visited[r][c] = true;
		
		while(!q.isEmpty()) {
		
		rc curr = q.poll();
		
		for(int i = 0; i < 4; i++) {
			int nr = curr.r + dr[i];
			int nc = curr.c + dc[i];
			
			if(nr >= 0 && nr < N && nc >= 0 && nc < M) {
				
				if(nr == N - 1 && nc == M - 1) {
					
					return curr.cnt + 1 ;
					
				}
				
				if(!visited[nr][nc] && map[nr][nc] == map[N-1][M-1]) {
					visited[nr][nc] = true;
					
					q.offer(new rc(nr, nc, curr.cnt + 1));
					
					
				}
				
			}
			
		}
		}
		
		return - 1;
		
		
	}
}
