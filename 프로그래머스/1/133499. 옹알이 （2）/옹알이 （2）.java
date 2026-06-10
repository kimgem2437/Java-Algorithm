
public class Solution {
	public int solution(String[] babbling) {
	
		int cnt = 0;
		
		String[] baby = {"aya", "ye", "woo", "ma"};
		
		for(String word : babbling) {
			
			for(String b : baby) {
				word = word.replace(b + b, "x");
			}
			
			for(String b : baby) {
				word = word.replace(b, " ");
			}
			
			if(word.trim().isEmpty()) cnt++;
			
		}
		return cnt;
	}
}
