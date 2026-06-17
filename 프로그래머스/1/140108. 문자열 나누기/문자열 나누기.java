
public class Solution {
	public int solution(String s) {
		
		char[] c = s.toCharArray();
		
		int cnt = 0;
		int first = 0;
		int another = 0;
		char f = 0;
		
		for(int i = 0; i < c.length; i++) {
			
			if(first == 0 && another == 0) {
				first++;
				f = c[i];
			} else if(first > 0 && another != first && f == c[i]) {
				first++;
			} else if(first > 0 && another != first && f != c[i]) {
				another++;
			}
			
			if(first == another) {
				cnt++;
				first = 0;
				another = 0;
			} else if(i == c.length-1) {
				cnt++;
			}
			
		}
		
		return cnt;
	}

}
