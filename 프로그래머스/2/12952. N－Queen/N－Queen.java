class Solution {
    
    int result = 0; 
    int[] board;
    
    public int solution(int n) {
        
        board = new int[n];
        
        dfs(0, n);
        
        return result;
    }
    
    public void dfs(int row, int n){
        
        if(row == n){
            result++;
            return;
        }
        
        for(int col = 0; col < n; col++){
            
            if(isPossible(row, col)){
                
                board[row] = col;  
                
                dfs(row + 1, n);
            }
            
        }
        
    }
    
    public boolean isPossible(int row, int col){
        
        for(int i = 0; i < row; i++){
            
            if(board[i] == col){
                return false;
            }
            
            if(Math.abs(row - i) == Math.abs(col - board[i])){
                return false;
            }
            
        }
        
        return true;
    }
}