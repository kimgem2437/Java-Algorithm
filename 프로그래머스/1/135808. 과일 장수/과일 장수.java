import java.util.Arrays;

public class Solution {
	public int solution(int k, int m, int[] score) {
	
		Arrays.sort(score);
		
		int cnt = 0;
		int result = 0;
		
		for(int i = score.length-1; i >= 0; i--) {
			
			if(score[i] <= k) {
			if(cnt < m) {
				cnt++;
				}
			if(cnt == m) {
				result += score[i]*m;
				cnt = 0;
			}
			}
			
		}
		
		return result;
	}
}
