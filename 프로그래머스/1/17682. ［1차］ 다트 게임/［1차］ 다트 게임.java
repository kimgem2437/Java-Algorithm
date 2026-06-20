
public class Solution {
	public int solution(String dartResult) {
		
		int result = 0;
		int[] num = new int[3];
		char[] bonus = new char[3];
		char[] option = new char[3];
		int cnt = 0;
		
		char[] c = dartResult.toCharArray();
		
		
		for(int i = 0; i < dartResult.length(); i++) {
			
			if(c[i] >= '0' && c[i] <= '9') {
				
				if(c[i] == '1' && c[i+1] == '0') {
					num[cnt] = 10;
				} else {
					
					if(i-1 >= 0 && c[i-1] >= '0' && c[i-1] <= '9') {
						continue;
					} else {
						num[cnt] = c[i] - '0';	
					}
				}
				
			} else if(c[i] == 'S' || c[i] == 'D' || c[i] == 'T') {
				bonus[cnt] = c[i];
			} else {
				option[cnt] = c[i];
			}
			
			if(i+1 < dartResult.length() && c[i+1] >= '0' && c[i+1] <= '9') {
				
				if(c[i] >= '0' && c[i] <= '9') {
					continue;
				} else {
					cnt++;
				}
			}
		}
		
		for(int i = 0; i < 3; i++) {
			
			switch(bonus[i]) {
			
			case 'S' :
				num[i] = (int) Math.pow(num[i], 1);
				break;
			case 'D' :
				num[i] = (int) Math.pow(num[i], 2);
				break;
			case 'T' :
				num[i] = (int) Math.pow(num[i], 3);
			}
			
			if(option[i] == '*') {
				
				if(i >= 1) {
					num[i-1] *= 2;
					num[i] *= 2;
				} else if(i < 1) {
					num[i] *= 2;
				}
				
			} else if(option[i] == '#') {
				num[i] *= -1;
			}
			
		}
		
		result = num[0] + num[1] + num[2];
		
		return result;
	}

}
