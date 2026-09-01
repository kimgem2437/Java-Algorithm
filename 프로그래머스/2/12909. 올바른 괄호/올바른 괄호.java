import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        
        Stack<String> st = new Stack<>();
        
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c == '('){
                st.push(String.valueOf(c));
            } else if(!st.isEmpty() && c == ')' && st.peek().equals("(")){
                st.pop();
            } else {
                answer = false;
                break;
            }
        }
        
        while(!st.isEmpty()){
            st.pop();
            answer = false;
        }
        
        return answer;
    }
}