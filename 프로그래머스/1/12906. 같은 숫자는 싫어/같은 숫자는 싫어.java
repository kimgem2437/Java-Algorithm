public class Solution {
	public int[] solution(int[] arr) {
	
		int cnt = 1;
		
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] != arr[i-1]) {
				cnt++;
			}
		}
		
		int[] num = new int[cnt];
		
		int idx = 0;
		num[idx++] = arr[0];
		
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] != arr[i-1]) {
				num[idx++] = arr[i];
			}
		}
		
		return num;
	}
}
