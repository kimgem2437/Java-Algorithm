import java.util.ArrayList;

public class Solution {
	public int[][] solution(int[][] data, String ext, int val_ext, String sort_by){
		
		int extIdx = getIndex(ext);
		int sortIdx = getIndex(sort_by);
		
		ArrayList<int[]> list = new ArrayList<>();
		
		for(int i = 0; i < data.length; i++) {
			
			if(data[i][extIdx] < val_ext) {
				list.add(data[i]);
			}
		}
		
		list.sort((a,b) -> Integer.compare(a[sortIdx], b[sortIdx]));
		
		int[][] answer = new int[list.size()][4];
		
		for(int i = 0; i < answer.length; i++) {
			answer[i] = list.get(i);
		}
		
		return answer;
		
				
	}
	
	private int getIndex(String str) {
		
		if(str.equals("code")) {
			return 0;
		} else if(str.equals("date")) {
			return 1;
		} else if(str.equals("maximum")) {
			return 2;
		} else {
			return 3;
		}
		
	}
}
