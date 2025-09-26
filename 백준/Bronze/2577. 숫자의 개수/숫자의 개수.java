import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int A = Integer.parseInt(br.readLine()); 
		int B = Integer.parseInt(br.readLine()); 
		int C = Integer.parseInt(br.readLine()); 
		
		int num = A * B * C;
		
		int[] tmp = new int[10];
		
		while(true) {
			
			int rest = num % 10;
			num /= 10;
			
			tmp[rest]++;
			
			if(num/10 == 0) {
				rest = num%10;
				tmp[rest]++;
				break;
			}
		}
		
		for(int i = 0; i < 10; i++) {
			System.out.println(tmp[i]);
		}
	}
}
