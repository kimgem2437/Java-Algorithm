import java.util.*;

class Solution {
    public int[] solution(String s) {
        
        int[] alpa = new int[26];

        int[] result = new int[s.length()];
        
        Arrays.fill(alpa, -1);
        
        for(int i = 0; i < s.length(); i++){
            
            if(alpa[s.charAt(i) - 'a'] == -1) {
                
                result[i] = -1;
                alpa[s.charAt(i) - 'a'] = i;
            } else {
                
                result[i] = i - alpa[s.charAt(i) - 'a'];
                
                alpa[s.charAt(i) - 'a'] = i;
                
            }

        }
        
        return result;
    }
}