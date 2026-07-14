class Solution {
    public String solution(String s) {
        
        String result;
        
        if(s.length() % 2 == 0) {
            
            int even = s.length()/2;
            
            result = "" + s.charAt(even-1) + s.charAt(even);
            
        } else {
            
            int odd = s.length()/2;
            
            result = "" + s.charAt(odd);
            
        }
        
        return result;
        
    }
}