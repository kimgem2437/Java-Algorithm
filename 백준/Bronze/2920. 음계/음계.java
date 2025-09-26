import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int[] da = new int[8];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < da.length; i++) {
			da[i] = Integer.parseInt(st.nextToken());
		}
		
		boolean as = true;
		boolean de = true;
		
		for(int i = 1; i < da.length; i++) {
			
			if(da[i] != da[i - 1] + 1) {
				as = false;
			}
			
			if(da[i] != da[i - 1] - 1) {
				de = false;
			} 
		}
		
		if(!as && !de) {
			System.out.println("mixed");
		} else if(as && !de) {
			System.out.println("ascending");
		} else {
			System.out.println("descending");
		}
		
		
	}
}
