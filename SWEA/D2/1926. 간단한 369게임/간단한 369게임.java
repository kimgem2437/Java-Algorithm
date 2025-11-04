import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
			
		for(int i = 1; i <= N; i++) {
			String s = Integer.toString(i);
			
			int clap = 0;
			
			for(int j = 0; j < s.toCharArray().length; j++) {
				
				char[] c = s.toCharArray();
				
				if(c[j] == '3' || c[j] == '6' || c[j] == '9') {
					clap++;
				}
			}
			
			if(clap == 0) {
				System.out.print(i);
			} else {
                for (int j = 0; j < clap; j++) {
                    System.out.print("-");
                }
		}
			
			if (i < N) {
                System.out.print(" ");
            }
		}
	}
}
