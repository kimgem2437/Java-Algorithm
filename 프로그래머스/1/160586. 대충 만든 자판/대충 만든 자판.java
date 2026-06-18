
public class Solution {
	public int[] solution(String[] keymap, String[] targets) {
		
		int[] alpa = new int[26];
		int[] cnt = new int[targets.length];
		
		for(int i = 0; i < keymap.length; i++) {
			
			char[] c = keymap[i].toCharArray();
			
			for(int j = 0; j < keymap[i].length(); j++) {
				
				if(alpa[c[j]-'A'] == 0) {
					alpa[c[j]-'A'] += j+1;
				} else {
					alpa[c[j]-'A'] = alpa[c[j] - 'A'] > j+1 ? j+1 : alpa[c[j] - 'A'];
				}
				
			}
		}
		
		for(int i = 0; i < targets.length; i++) {
			
			char[] c = targets[i].toCharArray();
			
			for(int j = 0; j < targets[i].length(); j++) {
				
				if(alpa[c[j] - 'A'] > 0) {
					cnt[i] += alpa[c[j] - 'A'];
				}else {
					cnt[i] = -1; 
					break;
				}
				
				
			}
		}
		
		return cnt;
	}

}
