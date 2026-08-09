import java.util.*;

class Solution {
    
    boolean[][] visited;
    int[] dr = {0, 0, 1, -1};
    int[] dc = {1, -1, 0, 0};
    int result = 0;
    
    public int solution(int[][] maps) {
        
        int r = maps.length;
        int c = maps[0].length;
        
        visited = new boolean[r][c];
        Queue<int[]> que = new LinkedList<>();
        
        que.offer(new int[]{0, 0, 1});
        visited[0][0] = true;
        
        while(!que.isEmpty()) {
            
            int[] current = que.poll();
            
            int currentR = current[0];
            int currentC = current[1];
            int distance = current[2];
            
            if(currentR == r - 1 && currentC == c - 1){
                return distance;
            }
            
            for(int i = 0; i < 4; i++){
                
                int nr = currentR + dr[i];
                int nc = currentC + dc[i];
                
                if(nr < 0 || nr >= r || nc < 0 || nc >= c) {
                    continue;
                }
                
                if(maps[nr][nc] == 0) {
                    continue;
                }
                
                if(visited[nr][nc]){
                    continue;
                }
                
                visited[nr][nc] = true;
                que.offer(new int[]{nr, nc, distance + 1});
            }
        }
        
        return -1;
    }
}