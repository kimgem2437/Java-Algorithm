import java.util.*;

class Solution {
    
    boolean[][] visited;
    int[] dr = {0, 0 , 1, -1};
    int[] dc = {1, -1, 0, 0};
    int answer = 0;
    
    public int solution(int[][] maps) {
        
        visited = new boolean[maps.length][maps[0].length];
        
        Queue<int[]> que = new LinkedList<>();
        
        que.offer(new int[]{0, 0, 1});
        
        while(!que.isEmpty()) {
            
            int[] curr = que.poll();
            visited[0][0] = true;
            
            int r = curr[0];
            int c = curr[1];
            int dis = curr[2];
            
            if(r == maps.length - 1 && c == maps[0].length -1) {
                return dis;
            }
            
            for(int i = 0; i < 4; i++) {
                
                int nr = dr[i] + r;
                int nc = dc[i] + c;
                
                if(nr >= maps.length || nr < 0 || nc >= maps[0].length || nc < 0) {
                    continue;
                }
                
                if(visited[nr][nc]) {
                    continue;
                }
                
                if (maps[nr][nc] == 0) {
                    continue;
                }
                
                visited[nr][nc] = true;
                que.offer(new int[]{nr, nc, dis + 1});
                
            }
            
        }
        
        
        return -1;
    }
}