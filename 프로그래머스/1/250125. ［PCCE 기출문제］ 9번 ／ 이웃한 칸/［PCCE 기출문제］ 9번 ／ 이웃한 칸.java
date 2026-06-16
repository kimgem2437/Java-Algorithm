
public class Solution {
	public int solution(String[][] board, int h, int w) {
		
		int[] dh = {-1, 1, 0, 0};
		int[] dw = {0, 0, -1, 1};
		
		
		int cnt = 0;
		
		for(int i = 0; i < 4; i++) {
			
			int dx = dh[i] + h;
			int dy = dw[i] + w;
			
			if(dx >= 0 && dx < board.length 
					&& dy >= 0 && dy < board[dx].length 
					&& board[h][w].equals(board[dx][dy])) cnt++;
			
		}
		
		return cnt;
		
	}
}
