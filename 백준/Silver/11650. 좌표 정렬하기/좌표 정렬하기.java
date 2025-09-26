import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	static List<num> coor;
	static StringBuilder sb = new StringBuilder();
	
	static class num {
		int num1;
		int num2;
		
		public num(int num1, int num2) {
			this.num1 = num1;
			this.num2 = num2;
		}

		@Override
		public String toString() {
			return this.num1 + " " + num2;
		}
	}
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		
		coor = new ArrayList<>();
		
		for(int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int first = Integer.parseInt(st.nextToken());
			int second = Integer.parseInt(st.nextToken());
			
			coor.add(new num(first, second));
		}
		
		Collections.sort(coor, (first, second) -> {
			if(first.num1 == second.num1) {
				return  first.num2 - second.num2;
			} return first.num1 - second.num1;
			
		});
		
		for(num number : coor) {
			sb.append(number.toString()).append('\n');
		}
		
		System.out.println(sb.toString());
		
	}
}
