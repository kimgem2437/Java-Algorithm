class Solution {
    public int solution(int n) {
        
        String binary = Integer.toBinaryString(n);
        int one = 0;
        
        for(int i = 0; i < binary.length(); i++){
            
            char c = binary.charAt(i);
            
            if(c == '1'){
                one++;
            }    
            
        }
        
        int result = 0;
    
        while(true){
            
            result = ++n;
            int resultOne = 0;
            
            String binaryResult = Integer.toBinaryString(result);
            
            for(int i = 0; i < binaryResult.length(); i++){
                char c = binaryResult.charAt(i);
            
                if(c == '1'){
                    resultOne++;
                }
                
            }
            
            if(resultOne == one){
                break;
            } 
        }
        
        
        return result;
    }
}