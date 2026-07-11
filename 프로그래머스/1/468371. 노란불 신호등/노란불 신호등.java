class Solution {
    public int solution(int[][] signals) {
        
        int limit = 1;
        
        for(int i = 0; i < signals.length; i++) {
            int cycle = signals[i][0] + signals[i][1] + signals[i][2];
            limit = lcm(limit, cycle);
        }
        
        for(int t = 1; t <= limit; t++) {
            
            boolean yellow = true;
            
            for(int i = 0; i < signals.length; i++) {
                
                int G = signals[i][0];
                int Y = signals[i][1];
                int R = signals[i][2];
                
                int cycle = G + Y + R;
                int now = (t - 1) % cycle + 1;
                
                if(!(now > G && now <= G + Y)){
                    yellow = false;
                    break;
                }
            }
            
            if(yellow) {
                return t;
            }
        }
        
        return -1;
        
    }
    
    public int lcm(int a, int b){
        
        int num = Math.max(a, b);
        
        while(true){
            if(num % a == 0 && num % b == 0) {
                return num;
            }
            num++;
        }
        
    }
}