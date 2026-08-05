class Solution {
    
    boolean[] visited;
    int result = 0;
    
    public int solution(int k, int[][] dungeons) {
        
        visited = new boolean[dungeons.length];
        
        dfs(k, dungeons, 0);
        
        return result;
        
    }
    
    public void dfs(int k, int[][] dungeons, int count){
        
        result = Math.max(result, count);
        
        for(int i = 0; i < dungeons.length; i++){
        
            if(visited[i]){
                continue;
            }
            
            int need = dungeons[i][0];
            int use = dungeons[i][1];
            
            if(k >= need) {
                visited[i] = true;
                dfs(k - use, dungeons, count + 1);
                visited[i] = false;
            }
            
        
        }
        
    }
}