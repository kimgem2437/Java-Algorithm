import java.util.Stack;

public class Solution {
	public int solution(int[] ingredient) {

		int cnt = 0;
		Stack<Integer> st = new Stack<>();

		
		for(int i = 0; i < ingredient.length; i++) {
			st.push(ingredient[i]);
			
			int size = st.size();
			
			if(size >= 4 && 
					st.get(size - 4) == 1 
					&& st.get(size - 3) == 2 
					&& st.get(size - 2) == 3 
					&& st.get(size - 1) == 1) {
				
				cnt++;
				
				for(int j = 0; j < 4; j++) {
					st.pop();
				}
			}

			
		}
		
		
		return cnt;
	}

}
