import java.util.*;

class Solution {
    
    int[] dr = {0, 0, -1, 1};
    int[] dc = {-1 , 1 ,0 ,0};
    Queue<int[]> que = new LinkedList<>();
    boolean[][] visited;
    
    public int solution(int[][] maps) {
        
        int n = maps.length;
        int m = maps[0].length;
        
        visited = new boolean[n][m];
        
        que.offer(new int[]{0, 0, 1});
        
         while(!que.isEmpty()){
            
            int[] location = que.poll();
            int r = location[0];
            int c = location[1];
            int distance = location[2];
             
            if(r == n - 1 && c == m - 1) {
                return distance;
            }
             
            for(int i = 0; i < 4; i++){
            
                int br = r + dr[i];
                int bc = c + dc[i];

                if(br >= 0 && br < maps.length && bc >= 0 && bc < maps[br].length 
                   && maps[br][bc] == 1 && !visited[br][bc]){
                    
                    visited[br][bc] = true;
                    que.offer(new int[]{br, bc, distance + 1});
                }
            }
            
             
         }
        
        return -1;
    }
}