class Solution {
    public int solution(int n) {
        int result = n + 1;
        
        int count = Integer.bitCount(n);
        
        while(true) {
            
            if(count == Integer.bitCount(result)){
                return result;
            }
            
            result++;
        }
    }
}