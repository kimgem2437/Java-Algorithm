
public class Solution {
	public int solution(int n, int m, int[] section) {
		
		int[] wall = new int[n];
		
		for(int i = 1; i <= n; i++) {
			wall[i-1] = i;
		}
		
		int cnt = 1;
		int first = section[0];
		
		for(int i = 1; i < section.length; i++) {
			
			if(section[i] - first >= m) {
				cnt++;
				first = section[i];
			}
		}
		
		return cnt;
	}
}
