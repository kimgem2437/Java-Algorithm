public class Solution {
	public String solution(String X, String Y) {
		
		
		int[] xcnt = new int[10];
		int[] ycnt = new int[10];
		
		for(int i = 0; i < X.length(); i++) {
			
			xcnt[X.charAt(i) - '0']++;
			
		}
		
		for(int i = 0; i < Y.length(); i++) {
			ycnt[Y.charAt(i) - '0']++;
		}
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 9; i >= 0; i--) {
			int min = Math.min(xcnt[i], ycnt[i]);
			
			if(min > 0) {
				for(int j = 1; j <= min; j++) {
					sb.append(i);
				}
			}
			
		}
		
		if(sb.length() < 0 || sb.toString().equals("")) {
			return "-1";
		} else if(sb.length() > 0 && sb.charAt(0) == '0') {
			return "0";
		} else {
			return sb.toString();
		}
		
		
		
	}

}
