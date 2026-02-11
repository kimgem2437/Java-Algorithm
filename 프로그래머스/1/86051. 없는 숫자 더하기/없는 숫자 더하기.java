public class Solution {
	public int solution(int[] numbers) {
		
		int sum = 45;
		int num = 0;
		
		for(int i = 0; i < numbers.length; i++) {
			num += numbers[i];
		}
		
		return sum - num;
	}
}
