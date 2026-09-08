class Solution {
    public int solution(String name) {
        
        int answer = 0;
        int n = name.length();
        
        int move = n - 1;
        
        for (int i = 0; i < n; i++) {
            
            char ch = name.charAt(i);
            
            int up = ch - 'A';
            int down = 'Z' - ch + 1;
            answer += Math.min(up, down);
            
            int next = i + 1;
            
            while (next < n && name.charAt(next) == 'A') {
                next++;
            }
            
            move = Math.min(move, i * 2 + n - next);
            move = Math.min(move, (n - next) * 2 + i);
        }
        
        return answer + move;
    }
}