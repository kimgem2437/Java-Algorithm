import java.util.Arrays;

public class Solution {
	public int[] solution(int N, int[] stages) {
		
		int[] cnt = new int[N+2];
		double[] fail = new double[N+1];
		int[] result = new int[N];
		
		for(int i = 0; i < stages.length; i++) {
			cnt[stages[i]]++;
		}
		
		int num = stages.length;
		
		for(int i = 1; i < N+1; i++) {
			fail[i] = (num == 0) ? 0 : (double) cnt[i] / num;
			
			num -= cnt[i];
		}
		
		Integer[] order = new Integer[N];
		for(int i = 0; i < N; i++) order[i] = i + 1;
		
		Arrays.sort(order, (a, b) -> {
			if(fail[a] == fail[b]) return a - b;
			return Double.compare(fail[b], fail[a]);
		});
		
		for(int i = 0; i < N; i++) result[i] = order[i];
		return result;
		
	}
}
