import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        
        String st = s.toUpperCase();
        
        int p = 0;
        int y = 0;
        
        for(int i = 0; i < s.length(); i++){
            
            if(st.charAt(i) == 'P'){
                p++;
            } else if(st.charAt(i) == 'Y') {
                y++;
            }
            
        }
        
        if(p == 0 && y == 0) {
            return answer;
        } else if(p != y){
            return !answer;
        } else {
            return answer;
        }
    }
}