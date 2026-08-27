import java.util.*;

class Solution {
    public String solution(String s, String skip, int index) {
        
        String result = "";
        
        for(int i = 0; i < s.length(); i++){
            
            char c = s.charAt(i);
            int cnt = 0;
            
            while(cnt < index){
                c++;
                
                if(c > 'z'){
                    c = 'a';
                }
                
                if(skip.contains(String.valueOf(c))){
                    continue;
                }
                
                cnt++;
            }
            
            result += c;
        }
        
        
        return result;
    }
}