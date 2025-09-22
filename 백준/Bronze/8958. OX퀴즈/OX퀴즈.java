import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		for(int k = 1; k <= T; k++) {
			
			char[] ch = br.readLine().toCharArray();
			
			int score = 0;
			
			for(int i = 0; i < ch.length; i++) {
				int cnt = 1;
				while(i < ch.length && ch[i] == 'O') {
					
					score += cnt;
					cnt++;
					i++;
					
				}

				
			}
			
			System.out.println(score);
		} //Test case
	} //main
}
