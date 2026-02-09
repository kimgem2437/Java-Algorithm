import java.util.Arrays;

public class Solution {
	public long solution(int a, int b) {
		
		int[] num = {a, b};
		Arrays.sort(num);
		
		if(num[0] == num[1]) {
			return (long)num[0];
		} else {
			long sum = 0;
			for(int i = num[0]; i <= num[1]; i++) {
				sum += i;
			}
			return (long)sum;
		}
	}
}
