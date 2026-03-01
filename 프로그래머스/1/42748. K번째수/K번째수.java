import java.util.Arrays;

public class Solution {
	public int[] solution(int[] array, int[][] commands) {
		
		
		int rel = commands.length;
		int[] result = new int[rel];
		
		
		
		for(int j = 0; j < rel; j++) {
			int len = commands[j][1]+1 - commands[j][0];
			int[] num = new int[len];
			int cnt = 0;
		for(int i = commands[j][0]; i < commands[j][1]+1; i++) {
			num[cnt] = array[i-1];
			cnt++;
		}
		Arrays.sort(num);
		result[j] = num[commands[j][2]-1];
		}
		
		
		
		return result;
	}
}
