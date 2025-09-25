import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	
	static List<User> wordlist;
	static StringBuilder sb = new StringBuilder();
	
	static class User {
		int age;
		String name;
		
		public User(int age, String name) {
			this.age = age;
			this.name = name;
		}

		@Override
		public String toString() {
			return this.age + " "  + this.name;
		}

		
		
	}
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		wordlist = new ArrayList<>();
		
		for(int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int age = Integer.parseInt(st.nextToken());
			String name = st.nextToken();
			
			wordlist.add(new User(age, name));
		}
		
		Collections.sort(wordlist, (u1, u2) -> {
			
			if(u1.age != u2.age) {
				return u1.age - u2.age;
			} return 0;
		});
		
		
		for(User user : wordlist) {
			sb.append(user.toString()).append('\n');
		}
		System.out.print(sb.toString());
	}
}
