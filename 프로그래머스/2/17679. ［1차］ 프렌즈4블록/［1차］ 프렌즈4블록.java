class Solution {
    public int solution(int m, int n, String[] board) {
        
        char[][] map = new char[m][n];
        
        for(int i = 0; i < m; i++){
            map[i] = board[i].toCharArray();
        }
        
        int result = 0;
        
        while(true) {
            
            boolean[][] remove = new boolean[m][n];
            boolean found = false;
            
            for(int r = 0; r < m - 1; r++){
                for(int c = 0; c < n - 1; c++){
                    
                    char ch = map[r][c];
                    
                    if(ch == ' '){
                        continue;
                    }
                    
                    if(ch == map[r][c + 1] && ch == map[r + 1][c] && ch == map[r + 1][c + 1]){
                        
                        remove[r][c] = true;
                        remove[r][c + 1] = true;
                        remove[r + 1][c] = true;
                        remove[r + 1][c + 1] = true;
                        
                        found = true;
                    }
                }
            }
            
            if(!found){
                break;
            }
            
            for(int r = 0; r < m; r++){
                for(int c = 0; c < n; c++){
                    if(remove[r][c]){
                        map[r][c] = ' ';
                        result++;
                    }
                }
            }
            
            for(int c = 0; c< n; c++){
                int bottom = m - 1;
                
                for(int r = m - 1; r >= 0; r--){
                    if(map[r][c] != ' '){
                        char temp = map[r][c];
                        map[r][c] = ' ';
                        map[bottom][c] = temp;
                        bottom--;
                    }
                }
            }
        }
        
        return result;
    }
}