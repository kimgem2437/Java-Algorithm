class Solution {
    public int[] solution(int n, int m) {
        
        
        int gcd = gcd(n, m);
        int lcm = n * m / gcd;
        
        
        
        return new int[]{gcd, lcm};
    }
    
    public int gcd(int a, int b){
        
        while(b != 0){
            
            int tmp = b;
            b = a % b;
            a = tmp;
            
        }
        
        return a;
        
    }
}