class Solution {
    public int solution(int[][] signals) {
        
        int limit = 1;
        
        for(int i = 0; i < signals.length; i++){
            int cycle = signals[i][0] + signals[i][1] + signals[i][2];
            limit = lcm(limit, cycle);
        }
        
        for(int t = 1; t <= limit; t++){
            
            boolean allYellow = true;
            
            for(int i = 0; i < signals.length; i++){
                int g = signals[i][0];
                int y = signals[i][1];
                int r = signals[i][2];
                
                int cycle = g + y + r;
                int pos = (t - 1) % cycle;
                
                if(!(pos >= g && pos < g + y)){
                    allYellow = false;
                    break;
                }
            }
            
            if(allYellow){
                return t;
            }  
        }
        
        return -1;
    }
    
    public int gcd(int a, int b){
        while(b != 0){
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
    
    public int lcm(int a, int b){
        return a / gcd(a, b) * b;
    }
}