import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	static int[][] paper;
	static int blue;
	static int white;

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		paper = new int[N][N];
		
		for(int r = 0; r < N; r++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int c = 0; c < N; c++) {
				paper[r][c] = Integer.parseInt(st.nextToken());
			}
		}
		divide(0,0,N);
		
		System.out.println(white);
		System.out.println(blue);
		
	}
	
	public static void divide(int x, int y, int size) {
		if(isSameColor(x, y, size)) {
			if(paper[x][y] == 0) white++;
			else blue++;
			return;
		}
		
		int half = size / 2;
		
		divide(x, y, half);
		divide(x, y+half, half);
		divide(x+half, y, half);
		divide(x+half, y+half, half);
	}
	
	public static boolean isSameColor(int x, int y, int size) {
		int color = paper[x][y];
		
		for(int r = x; r < x + size; r++) { 
			
			for(int c = y; c < y + size; c++) {
				if(paper[r][c] != color) {
					return false;
				}
			}
		}
		return true;
	}
	
}
