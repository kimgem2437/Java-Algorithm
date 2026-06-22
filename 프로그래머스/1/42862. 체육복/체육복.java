
public class Solution {
	public int solution(int n, int[] lost, int[] reserve) {
		
		int[] student = new int[n];
		boolean[] isok = new boolean[n];
		int result = 0;
		
		for(int i = 0; i < n; i++) {
			student[i]++;
			
			if(lost.length > i) {
				student[lost[i] - 1]--;
			}
			if(reserve.length > i) {
				student[reserve[i] - 1]++;
				isok[reserve[i] - 1] = true;
			}
		}
		
		
		
		for(int i = 0; i < n; i++) {
			
			if(i == 0 && student[i + 1] < 1 && student[i] > 1) {
				student[i]--;
				student[i + 1]++;
			}
			
			if(i > 0 && isok[i] == true && student[i-1] < 1 && student[i] > 1) {
				student[i-1]++;
				student[i]--;
			} else if(i > 0 && i+1 < n && isok[i] == true && student[i + 1] < 1 && student[i] > 1) {
				student[i+1]++;
				student[i]--;
			}
			
		}
		
		for(int i = 0; i < n; i++) {
			if(student[i] > 0) result++;
		}
		
		
		return result;
		
	}
}
