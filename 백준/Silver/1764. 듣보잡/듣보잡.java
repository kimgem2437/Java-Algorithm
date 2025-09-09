import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	
		public static void main(String[] args) throws IOException {
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			
			HashSet<String> Nhear = new HashSet<>();
			for(int i = 0; i < N; i++) {
				Nhear.add(br.readLine());
			}
			
			List<String> Nlook = new ArrayList<>();
			for(int i = 0; i < M; i++) {
				String name = br.readLine();
				if(Nhear.contains(name)) {
					Nlook.add(name);
				}
				
			}
			
			Collections.sort(Nlook);
			
			System.out.println(Nlook.size());

			for(String name : Nlook) {
				System.out.println(name);
			}
			
			
	}
}
