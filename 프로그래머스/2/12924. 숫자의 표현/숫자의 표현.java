class Solution {
    public int solution(int n) {
        
        int result = 0;
        
        for(int i = 1; i <= n; i++){
            
            int sum = n;
            
            for(int j = i; j <= sum; j++){
                sum -= j;
                if(sum == 0){
                    result++;
                }
            }
            
        }
        
        return result;
    }
}