class Solution {
    public String solution(String s, String skip, int index) {
        
        StringBuilder sb = new StringBuilder();
        
        
        for(int i = 0; i < s.length(); i++){
            
            char c = s.charAt(i);
            
            int cnt = 0;
            while(cnt < index){
                c++;
                if(c > 'z') {
                    c -= 26;
                }
                if(skip.contains(String.valueOf(c))){
                    continue;
                } else {
                    cnt++;
                }
            }
            sb.append(c);
        }
        
        return sb.toString();
    }
}