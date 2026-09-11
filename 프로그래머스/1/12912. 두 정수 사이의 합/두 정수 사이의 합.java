class Solution {
    public long solution(int a, int b) {
        
        long result = 0;
        
        if(a <= b) {
            for(long i = a; i <= b; i++){
                result += i;
            }
        } else {
            for(long i = b; i <= a; i++){
                result += i;
            }
        }

        return result;
    }
}