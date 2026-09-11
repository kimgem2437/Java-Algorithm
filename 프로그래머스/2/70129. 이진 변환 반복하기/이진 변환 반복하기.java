import java.util.*;

class Solution {
    public int[] solution(String s) {
        
        int cnt = 0;
        int zero = 0;
        
        String st = s;
        
        while(!st.equals("1")){
            
            cnt++;
            
            int len = st.length();
            st = st.replace("0", "");
            int one = st.length();
            
            zero += (len - one);
            
            st = Integer.toBinaryString(one);
            
        }
        
        int[] result = {cnt, zero};
        
        return result;
    }
}