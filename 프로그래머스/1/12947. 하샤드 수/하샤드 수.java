public class Solution {
	public boolean solution(int x) {
		boolean answer = true;
		
		String s = String.valueOf(x);
		char[] c = s.toCharArray();
		
		int n = 0;
		
		for(int i = 0; i < c.length; i++) {
			n += c[i] - '0';
		}
		
		if(x % n == 0) {
			return answer;
		} else {
			return !answer;
		}
	
	}
}
