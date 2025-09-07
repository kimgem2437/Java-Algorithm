import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb= new StringBuilder();
		
		
		String[] string = new String[5];
		int maxlength = 0;
		
		
		for(int i = 0; i < 5; i++) {
			string[i] = br.readLine();
			if(string[i].length() > maxlength) {
				maxlength = string[i].length();	
			}
		}
		
		for(int i = 0; i < maxlength; i++) {
			
			for(int j = 0; j < 5; j++) {
				
				if(i < string[j].length()) {
				sb.append(string[j].charAt(i));
				}
				
			}
			
		}
		System.out.println(sb);
		
	}
}
