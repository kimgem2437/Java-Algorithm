

public class Solution {
	public int[] solution(int[] lottos, int[] win_nums) {
		
		int[] result = new int[2];
		
		for(int i = 0; i < 6; i++) {
			
			for(int j = 0; j < 6; j++) {
				
				if(lottos[i] == 0) {
					result[0]++;
					break;
				} else if(lottos[i] == win_nums[j]){
					result[0]++;
					result[1]++;
					break;
				}
				
			}
			
		}
		
		for(int i = 0; i < 2; i++) {
			switch(result[i]) {
			case 6 :
				result[i] = 1;
				break;
			case 5 :
				result[i] = 2;
				break;
			case 4 :
				result[i] = 3;
				break;
			case 3 :
				result[i] = 4;
				break;
			case 2 :
				result[i] = 5;
				break;
				default :
					result[i] = 6;
			}
		}
		

		return result;
	}
}
