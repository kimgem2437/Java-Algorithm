import java.util.*;

class Solution {
    
    Queue<int[]> que = new LinkedList<>();
    boolean[][] visited;
    int[] dr = {0, 0, -1, 1};
    int[] dc = {1, -1, 0, 0};
    
    public int solution(int[][] maps) {
        
        int result = 0;
        visited = new boolean[maps.length][maps[0].length];
        
        int finishR = maps.length-1;
        int finishC = maps[0].length-1;
        
        que.offer(new int[]{0, 0, 1});
        
        while(!que.isEmpty()){
            
            int[] map = que.poll();
            
            int r = map[0];
            int c = map[1];
            int dis = map[2];
            
            
            if(r == finishR && c == finishC){
                result = dis;
                break;
            }
            
            for(int i = 0; i < 4; i++){
                
                int nr = r + dr[i];
                int nc = c + dc[i];
                
                if(nr >= 0 && nr < maps.length && nc >= 0 && nc < maps[nr].length
                  && !visited[nr][nc] && maps[nr][nc] == 1){
                    visited[nr][nc] = true;
                    que.offer(new int[]{nr, nc, dis + 1});
                }
                
            }
        }
        
        if(visited[finishR][finishC]){
            return result;
        } else {
            return -1;
        }

    }
}