
public class Solution {
	public int solution(int[] nums) {
		
		int cnt = 0;
	
		for(int i = 0; i < nums.length; i++) {
			
			for(int j = i+1; j < nums.length; j++) {
				
				
				for(int k = j+1; k < nums.length; k++) {
					
					int num = nums[i] + nums[j] + nums[k];
					boolean isok = true;
					
					for(int x = 2; x <= Math.sqrt(num); x++) {
						if(num % x == 0) {
							isok = false;
							break;
						}
					}
					
					if(isok) {
						cnt++;
					}
					
				}
			}
		}
		
		return cnt;
		
	}
}
