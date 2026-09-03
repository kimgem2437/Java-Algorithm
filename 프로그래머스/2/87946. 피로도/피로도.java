class Solution {
    
    boolean[] visited;
    int result = 0;
    
    public int solution(int k, int[][] dungeons) {
        
        visited = new boolean[dungeons.length];
        
        dfs(k, dungeons, 0);
        
        return result;
    }
    
    public void dfs(int k, int[][] dungeons, int cnt){
        
        result = Math.max(cnt, result);
        
        for(int i = 0; i < dungeons.length; i++){
            
            if(dungeons[i][0] > k || visited[i]){
                continue;
            }
            
            visited[i] = true;
            dfs(k - dungeons[i][1], dungeons, cnt + 1);
            visited[i] = false;
            
            if(k == 0){
                break;
            }
        }
        
    }
}