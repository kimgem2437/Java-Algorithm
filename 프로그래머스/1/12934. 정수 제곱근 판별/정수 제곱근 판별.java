class Solution {
    public long solution(long n) {
        
        long sq = (long)Math.sqrt(n);
        long result = 0;
        
        if(sq*sq == n) {
            result = (sq + 1) * (sq + 1);
        } else {
            return -1;
        }
        
        return result;
    }
}