import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Solution {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int T = Integer.parseInt(br.readLine());
        
        for(int k = 1; k <= T; k++) {
            
            String s = br.readLine();
            Stack<Character> stack = new Stack<>();
            int count = 0;
            
            for(int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                
                if (c == '.') {
                    continue; 
                }
                
                if (c == '(') {
                    stack.push(c);
                } else if (c == ')') {
                    if (!stack.isEmpty()) {
                        char top = stack.peek();
                        
                        if (top == '(') {
                            stack.pop(); 
                            count++;
                        } 
                        else if (top == '|') { 
                            stack.pop();
                            count++;
                        }
                    }
                } else if (c == '|') {
                    
                    if (!stack.isEmpty() && stack.peek() == '(') {
                        stack.pop();   
                        count++;   
                        stack.push(c);
                    } else {
                        stack.push(c);
                    }
                }
            }
            
            sb.append("#").append(k).append(" ").append(count).append("\n");
        }
        
        System.out.println(sb);
    }
}