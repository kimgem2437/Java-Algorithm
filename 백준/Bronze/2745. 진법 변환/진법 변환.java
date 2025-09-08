import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		char[] ch = st.nextToken().toCharArray();
		int N = Integer.parseInt(st.nextToken());
		
		int result = 0;
		int pow = 1;

		for(int i = ch.length - 1; i >= 0; i--) {
		    int value;

		    if (ch[i] >= '0' && ch[i] <= '9') {
		        value = ch[i] - '0';
		    } 
		    else {
		        value = ch[i] - 'A' + 10;
		    }

		    result += value * pow;

		    pow *= N;
		}

		System.out.println(result);
	}
}