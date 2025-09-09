import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {

	static int min;
	static int[] price;
	static int[] plan;
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		for(int k = 1; k <= T; k++) {
		
		price = new int[4];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		
		for(int i = 0; i < 4; i++) {
			price[i] = Integer.parseInt(st.nextToken());
		}
		
		plan = new int[12];
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < 12; i++) {
			plan[i] = Integer.parseInt(st.nextToken());
		}
		
		min = price[3];
		
		dfs(0, 0);
		
		System.out.println("#" + k + " " + min);
		} //Test case
		
	}
	
	
	static void dfs(int month, int current) {
		
		int mincost = 0;
		
		if(month >= 12) {
			min = Math.min(min,current);
				return;
			}
		
		if(plan[month] > 0) {
			int day = plan[month] * price[0];
			dfs(month + 1, current + day);
		} 
		else { 
			dfs(month + 1, current);
		}
		
		dfs(month + 1, current + price[1]);
		
		if(month <= 9) {
			dfs(month + 3, current + price[2]);
		}
		
		
		
			
		}
		
	}

