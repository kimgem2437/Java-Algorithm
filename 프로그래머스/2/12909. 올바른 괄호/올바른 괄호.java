import java.util.*;

class Solution {
    boolean solution(String s) {
        
        Stack<Character> st = new Stack<>();
        
        for(int i = 0; i < s.length(); i++){
            
            char c = s.charAt(i);
            
            if(st.isEmpty()){
                st.push(c);
            } else if(!st.isEmpty() && c == ')' && st.peek() == '('){
                st.pop();
            } else {
                st.push(c);
            }
            
        }
        
        if(!st.isEmpty()){
            return false;
        } else {
            return true;
        }
       
    }
}