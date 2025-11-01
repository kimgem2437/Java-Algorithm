import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {

	static int[] sr = {-1, 1, 0, 0};
	static int[] sc = {0, 0, -1, 1};
	static int[] dr = {-1, 1, -1, 1};
	static int[] dc = {-1, 1, 1, -1};
	static int[][] sp;
	static int N;
	static int M;
	static int max;
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());

		for(int t = 1; t <= T; t++) {
			sb.append("#").append(t).append(" ");

			StringTokenizer st = new StringTokenizer(br.readLine());

			N = Integer.parseInt(st.nextToken());
			M = Integer.parseInt(st.nextToken());

			sp = new int[N][N];

			for(int r = 0; r < N; r++) {
				st = new StringTokenizer(br.readLine());
				for(int c = 0; c < N; c++) {
					sp[r][c] = Integer.parseInt(st.nextToken());
				}
			}

			int max = Integer.MIN_VALUE;

			for(int r = 0; r < N; r++) {

				for(int c = 0; c < N; c++) {
					int Dsum = sp[r][c];
					int Ssum = sp[r][c];

					for(int j = 1; j < M; j++) {
						for(int i = 0; i < 4; i++) {

							int nr = r + dr[i] * j;
							int nc = c + dc[i] * j;
							int mr = r + sr[i] * j;
							int mc = c + sc[i] * j;
							
							if(nr >= 0 && nr < N && nc >= 0 && nc < N) {
								Dsum += sp[nr][nc];
							}
							
							if(mr >= 0 && mr < N && mc >= 0 && mc < N) {
								Ssum += sp[mr][mc];
							}


						}
					}
					
					max = Math.max(max,Math.max(Dsum, Ssum));
					
				}
			}

			sb.append(max).append("\n");
		} // Test case
		System.out.println(sb);
	} // main


}
