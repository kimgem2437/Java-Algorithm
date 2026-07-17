class Solution {
    public String solution(String X, String Y) {
        
        int[] xnum = new int[10];
        int[] ynum = new int[10];
        
        for(int i = 0; i < X.length(); i++){
            
            char c = X.charAt(i);
            
            xnum[c - '0']++;
            
        }
        
        for(int i = 0; i < Y.length(); i++){
            
            char c = Y.charAt(i);
            
            ynum[c - '0']++;
            
        }
        
        StringBuilder sb = new StringBuilder(); 
        
        for(int i = 9; i >= 0; i--){
            
            int min = Math.min(xnum[i], ynum[i]);
            
            for(int j = 0; j < min; j++){
                sb.append(i);
            }
            
        }
        
        if(sb.length() == 0) {
            return "-1";
        }
        
        if(sb.charAt(0) == '0'){
            return "0";
        }
        
        return sb.toString();
    }
}