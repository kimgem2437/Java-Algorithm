class Solution {
    public String solution(String new_id) {
        
        StringBuilder sb = new StringBuilder();
        
        new_id = new_id.toLowerCase();
        
        for(int i = 0; i < new_id.length(); i++){
            
            char c = new_id.charAt(i);
            
            if((c >= 'a' && c <= 'z') || (c >= '0' && c <= '9') || c == '-' || c == '_' || c == '.'){
                if(c == '.' && sb.length() > 0 && sb.charAt(sb.length() - 1) == '.'){
                    continue;
                }
                sb.append(c);
            }
            
        }
        
        if(sb.length() > 0 && sb.charAt(0) == '.') {
            sb.deleteCharAt(0);
        }
        
        if(sb.length() > 0 && sb.charAt(sb.length() - 1) == '.') {
            sb.deleteCharAt(sb.length() - 1);
        }
        
        if(sb.length() >= 16){
            sb = new StringBuilder(sb.substring(0, 15));
        
                if(sb.length() > 0 && sb.charAt(sb.length() - 1) == '.') {
                sb.deleteCharAt(sb.length() - 1);
            }
        }
        
        if(sb.length() == 0) {
            sb.append("a");
        }
        
        while(sb.length() < 3) {
            sb.append(sb.charAt(sb.length() - 1));
        }
    
        return sb.toString();
    }
}