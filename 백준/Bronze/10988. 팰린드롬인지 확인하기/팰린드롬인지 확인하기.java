import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String st = br.readLine();
		
		StringBuilder sb = new StringBuilder(st);
		
		String rv = sb.reverse().toString();
		
		if(st.equals(rv)) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}
		
	}
}
