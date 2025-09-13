import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	static class knight {
		int r, c, cnt;

		public knight(int r, int c, int cnt) {
			this.r = r;
			this.c = c;
			this.cnt = cnt;
		}
	}
	
	static int l;
	static boolean visited[][];
	
	static int[] dr = {-2, -2, -1, -1, 1, 1, 2, 2};
	static int[] dc = {-1, 1, -2, 2, -2, 2, -1, 1};
	static int Sr;
	static int Sc;
	static int Er;
	static int Ec;
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		for(int tc = 1; tc <= T; tc++) {
		l = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		Sr = Integer.parseInt(st.nextToken());
		Sc = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		Er = Integer.parseInt(st.nextToken());
		Ec = Integer.parseInt(st.nextToken());
		
		visited = new boolean[l][l];
		int k = bfs(Sr, Sc, Er, Ec);
		System.out.println(k);
		}//Test case
	}//main
	
	static int bfs(int Sr, int Sc, int Er, int Ec) {

		if (Sr == Er && Sc == Ec) {
            return 0;
        }
		
		Queue<knight> q = new ArrayDeque<>();
		
		q.offer(new knight(Sr, Sc, 0));
		
		visited[Sr][Sc] = true;
		
		while(!q.isEmpty()) {
			knight curr = q.poll();
			
			if(curr.r == Er && curr.c == Ec) {
				return curr.cnt;
			}
			
			for(int i = 0; i < 8; i++) {
				
				int nr = curr.r + dr[i];
				int nc = curr.c + dc[i];
				
				if(nr >= 0 && nr < l && nc >= 0 && nc < l && !visited[nr][nc]) {
					visited[nr][nc] = true;
					q.offer(new knight(nr, nc, curr.cnt + 1));
				}
				
			}
			
		}
		return -1;
		
	}
	
}
