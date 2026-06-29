class Solution {
    public String solution(String new_id) {
        
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < new_id.length(); i++){
            
            char c = new_id.charAt(i);
            
            if(c >= 'A' && c <= 'Z'){
                c = Character.toLowerCase(c);
            }
            
            boolean isLetter = c >= 'a' && c <= 'z';
            boolean isNumber = c >= '0' && c <= '9';
            boolean isSpecial = c == '-' || c == '_' || c == '.';
            
            if(!(isLetter || isNumber || isSpecial)){
                continue;
            }
            
            if(c == '.' && sb.length() > 0 && sb.charAt(sb.length() - 1) == '.'){
                continue;
            }
            
            sb.append(c);
        }
            
        if(sb.length() > 0 && sb.charAt(0) == '.'){
            sb.deleteCharAt(0);
        }
        
        if(sb.length() > 0 && sb.charAt(sb.length() -1) == '.'){
            sb.deleteCharAt(sb.length() - 1); 
        }
        
        if(sb.length() == 0) {
            sb.append("a");
        }
        
        if(sb.length() >= 16) {
            sb.setLength(15);
            
            if(sb.charAt(sb.length() - 1) == '.') {
                sb.deleteCharAt(sb.length() - 1);
            }
        }
        
        while(sb.length() < 3){
            sb.append(sb.charAt(sb.length() - 1));
        }
        
        return sb.toString();
        
    }
}