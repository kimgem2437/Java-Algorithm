import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution {
	public long solution(long n) {
		String s = String.valueOf(n);
		
		char[] c = s.toCharArray();
		Arrays.sort(c);
		String answer = new StringBuilder(new String(c)).reverse().toString();
				
		return Long.parseLong(answer);
	}
}
