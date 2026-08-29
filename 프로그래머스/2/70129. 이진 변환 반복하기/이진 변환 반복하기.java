import java.util.*;

class Solution {
    public int[] solution(String s) {
        
        int circle = 0;
        int zero = 0;
        
        while(!s.equals("1")){
            
            int oneCount = 0;
            
            for(int i = 0; i < s.length(); i++){
                char c = s.charAt(i);
                
                if(c == '0') {
                    zero++;
                }else {
                    oneCount++;
                }
            }
            
            s = Integer.toBinaryString(oneCount);
            circle++;
        }
        
        
        int[] result = {circle, zero};
        
        return result;
    }
}