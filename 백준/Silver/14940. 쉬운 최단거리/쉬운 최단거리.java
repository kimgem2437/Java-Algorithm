import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	
	static int[] dr = {-1, 1, 0, 0};
	static int[] dc = {0, 0, -1, 1};
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		StringTokenizer st  = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int[][] map = new int[N][M];
		int[][] dist = new int[N][M];
		
		int goalR = 0;
		int goalC = 0;
		
		for(int r = 0; r < N; r++) {
			st = new StringTokenizer(br.readLine());
			for(int c = 0; c < M; c++) {
				map[r][c] = Integer.parseInt(st.nextToken());
				if(map[r][c] == 2) {
					goalR = r;
					goalC = c;
				}
				dist[r][c] = -1;
			}
		}	
		
		Queue<int[]> q = new LinkedList<>();
		q.offer(new int[]{goalR, goalC});
		dist[goalR][goalC] = 0;
		
		while(!q.isEmpty()) {
			int[] curr= q.poll();
			int r = curr[0];
			int c = curr[1];
			
			for(int i = 0; i < 4; i++) {
				int nr = r + dr[i];
				int nc = c + dc[i];
				
				if(nr >= 0 && nr < N && nc >= 0 && nc < M && dist[nr][nc] == -1 && map[nr][nc] == 1) {
					dist[nr][nc] = dist[r][c] + 1;
					q.offer(new int[]{nr, nc});
				}
				
			}
		}
		
		for(int r = 0; r < N; r++) {
			for(int c = 0; c < M; c++) {
				if(map[r][c] == 0) {
					sb.append("0").append(" ");
				} else {
					sb.append(dist[r][c]).append(" ");
				}
			}
			sb.append("\n");
		}
		
		System.out.println(sb);
	}
}
