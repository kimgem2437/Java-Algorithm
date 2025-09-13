import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	
	static int w;
	static int h;
	static boolean[][] visited;
	static int[][] map;
	static StringBuilder sb = new StringBuilder();
	static int[] dr = {-1, 1, 0, 0, -1, -1, 1, 1};
	static int[] dc = {0, 0, -1 , 1, -1, 1, -1, 1};
	
	static class start {
		int r, c;

		public start(int r, int c) {
			this.r = r;
			this.c = c;
		}
	}

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		//h : 높이, w : 너비
		w = Integer.parseInt(st.nextToken());
		h = Integer.parseInt(st.nextToken());
		
		//w에서 0을 받고 c에서 0을 받으면 테스트 케이스는 끝
		if(w == 0 && h == 0) {
			break;
		}
		
		visited = new boolean[h][w];
		map = new int[h][w];
		
		for(int r = 0; r < h; r++) {
			st = new StringTokenizer(br.readLine());
			for(int c = 0; c < w; c++) {
			map[r][c] = Integer.parseInt(st.nextToken());
		}
		}
		
		
		
		int cnt = 0;
		
		for(int r = 0; r < h; r++) {
			for(int c = 0; c < w; c++) {
			if(map[r][c] == 1 && !visited[r][c]) {
				bfs(r,c);
				cnt++;
			}
				
		}
		}
		
		System.out.println(cnt);
		
		} // 0 , 0이 나올 때까지 while
		
	} //main 
	
	static void bfs(int r, int c) {
		Queue<start> q = new ArrayDeque<>();
		q.offer(new start(r, c));
		visited[r][c] = true;
		
		while(!q.isEmpty()) {
			start curr = q.poll();
			
			for(int i = 0; i < 8; i++) {
				int nr = curr.r + dr[i];
				int nc = curr.c + dc[i];
				
				if(nr >= 0 && nr < h && nc >= 0 && nc < w && map[nr][nc] == 1 && !visited[nr][nc]) {
					visited[nr][nc] = true;
					q.offer(new start(nr, nc));
				}
				
			}
			
			
		}
		
		
	}
}
