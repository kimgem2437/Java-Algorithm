import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	
	static String line;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		
		while((line = br.readLine()) != null) {

			Stack<Character> st = new Stack<>();
			
			char[] ch = line.toCharArray();
			
			
			
			boolean isok = true;

			if(line.equals(".")) {
				break;
			}


			for(int j = 0; j < ch.length; j++) {


				if(ch[j] == '(' || ch[j] == '[') {
					st.push(ch[j]);
				} else if(ch[j] == ')') {
					if(st.isEmpty() || st.pop() != '(') {
						isok = false;
						break;
					}
					
				} else if(ch[j] == ']') {
					if(st.isEmpty() || st.pop() != '[') {
						isok = false;
						break;
					}
				}


			}


			if(isok && st.isEmpty()) {
				System.out.println("yes");
			} else {
				System.out.println("no");
			}

		}

	} //main 

}
