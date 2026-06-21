import java.util.Arrays;

public class Solution {
	public String solution(String[] participant, String[] completion) {
		
		String result = "";
		
		Arrays.sort(participant);
		Arrays.sort(completion);
		
		for(int i = 0; i < participant.length; i++) {
			if(i < completion.length && participant[i].equals(completion[i])) {
				participant[i] = "";
			} else {
				result = participant[i];
				break;
			}
		}

		
		return result;
		
	}
}
