import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		for(int tc = 1; tc <= T; tc++) {
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			int H = Integer.parseInt(st.nextToken());
			int W = Integer.parseInt(st.nextToken());
			int guest = Integer.parseInt(st.nextToken());
			
			int room = 1;
			
			for(int i = 0; i < W; i++) {
				
				for(int j = 0; j < H; j++) {
					guest--;
					room += 100;
					if(guest == 0) {
						System.out.println(room);
						break;
					}
				}
				room -= H*100;
				room += 1;
			}
			
			
		} //Test case
	} // main
}
