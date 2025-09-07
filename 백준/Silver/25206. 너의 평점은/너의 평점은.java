import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int total = 20;
		String[] string = new String[3];
		double avg = 0;
		double pcnt = 0;
		double totalcredit = 0.0;
		
		for(int i = 0; i < 20; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			string[0] = st.nextToken();
			string[1] = st.nextToken();
			string[2] = st.nextToken();
 			
			double credit = Double.parseDouble(string[1]);
			double grade = 0.0;
			
		  
			if(string[2].toString().equals("P")) {
			continue;
			}
			
			if(string[2].toString().equals("A+")) {
				 grade = 4.5;
			} else if(string[2].toString().equals("A0")) {
				 grade = 4.0;
			} else if(string[2].toString().equals("B+")) {
				 grade = 3.5;
			} else if(string[2].toString().equals("B0")) {
				 grade = 3.0;
			} else if(string[2].toString().equals("C+")) {
				 grade = 2.5;
			} else if(string[2].toString().equals("C0")) {
				 grade = 2.0;
			} else if(string[2].toString().equals("D+")) {
				 grade = 1.5;
			} else if(string[2].toString().equals("D0")) {
				 grade = 1.0;
			} else if(string[2].toString().equals("F")) {
				 grade = 0.0;
			}
			
			
			totalcredit += credit;
			avg += (credit * grade);
			
		}
		
		avg /= totalcredit;
		
		System.out.printf("%f6",avg);
		
	}
}
