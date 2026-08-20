class Solution {
    
    int[] dr = {0, 0, 1, -1};
    int[] dc = {1, -1, 0, 0};
    
    public int[] solution(String[][] places) {
        
        int[] result = new int[5];
        
        for(int i = 0; i < 5; i++){
            if(checkRoom(places[i])) {
                result[i] = 1;
            } else {
                result[i] = 0;
            }
        }
        
        return result;
}
    
    public boolean checkRoom(String[] room) {
        
        for(int r = 0; r < 5; r++) {
            for(int c = 0; c < 5; c++) {
                
                if(room[r].charAt(c) == 'P'){
                    boolean[][] visited = new boolean[5][5];
                    
                    if(!dfs(room, r, c, 0, visited)){
                        return false;
                    }
                }
                
            }
        }
        
        return true;
    }
    
    public boolean dfs(String[] room, int r, int c, int distance, boolean[][] visited){
        
        visited[r][c] = true;
        
        if(distance > 0 && room[r].charAt(c) == 'P'){
            return false;
        }
        
        if(distance == 2) {
            return true;
        }
        
        for(int i = 0; i < 4; i++) {
            
            int nr = r + dr[i];
            int nc = c + dc[i];
            
            if(nr < 0 || nr >= 5 || nc < 0 || nc >= 5) {
                continue;
            }
            
            if(visited[nr][nc]) {
                continue;
            }
            
            if(room[nr].charAt(nc) == 'X') {
                continue;
            }
            
            if(!dfs(room, nr, nc, distance + 1, visited)){
                return false;
            }
        }
            
            return true;
        }
    }