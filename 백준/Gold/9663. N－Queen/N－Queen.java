import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	static int N;
	static int[] chess;
	static int cnt;
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());
		
		chess = new int[N];
		
		back(0);
		
		System.out.println(cnt);
		
	}
	
	public static void back(int row) {
		
		if(row == N) {
			cnt++;
			return;
		}
		
		for(int i = 0; i < N; i++) {
			chess[row] = i;
			
			if(check(row)) {
				back(row + 1);
			}
		
		} 
		
		
	}
	
	public static boolean check(int row) {
		
		for(int i = 0; i < row; i++) {
			
			if(chess[i] == chess[row]) return false;
			if(Math.abs(row-i) == Math.abs(chess[row] - chess[i])) return false;  
			
		}
		return true;
		
	}
}
