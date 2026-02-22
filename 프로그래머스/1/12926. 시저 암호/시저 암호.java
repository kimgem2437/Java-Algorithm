
public class Solution {
	public String solution(String s, int n) {
	
		char[] c = s.toCharArray();
		String st = "";
		
		for(int i = 0; i < s.length(); i++) {
			if(c[i] >= 'a' && c[i] <= 'z') {
			st += (char) ((c[i] - 'a' + n) % 26 + 'a'); 
			} else if(c[i] >= 'A' && c[i] <= 'Z'){
				st += (char) ((c[i] - 'A' + n) % 26 + 'A');
			} else {
				st += c[i];
			}
			
		}
		
		return st;
		
	}
}
