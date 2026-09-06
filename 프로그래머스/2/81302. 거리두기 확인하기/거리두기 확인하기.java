import java.util.*;

class Solution {
    
    int[] dr = {-1, 1, 0, 0};
    int[] dc = {0, 0, -1, 1};
    
    public int[] solution(String[][] places) {
        
        int[] result = new int[5];
        
        for (int i = 0; i < 5; i++) {
            if (checkRoom(places[i])) {
                result[i] = 1;
            } else {
                result[i] = 0;
            }
        }
        
        return result;
    }
    
    public boolean checkRoom(String[] room) {
        
        for (int r = 0; r < 5; r++) {
            for (int c = 0; c < 5; c++) {
                
                if (room[r].charAt(c) == 'P') {
                    if (!bfs(room, r, c)) {
                        return false;
                    }
                }
            }
        }
        
        return true;
    }
    
    public boolean bfs(String[] room, int startR, int startC) {
        
        Queue<int[]> que = new LinkedList<>();
        boolean[][] visited = new boolean[5][5];
        
        que.offer(new int[]{startR, startC, 0});
        visited[startR][startC] = true;
        
        while (!que.isEmpty()) {
            
            int[] cur = que.poll();
            
            int r = cur[0];
            int c = cur[1];
            int distance = cur[2];
            
            if (distance == 2) {
                continue;
            }
            
            for (int i = 0; i < 4; i++) {
                
                int nr = r + dr[i];
                int nc = c + dc[i];
                
                if (nr < 0 || nr >= 5 || nc < 0 || nc >= 5) {
                    continue;
                }
                
                if (visited[nr][nc]) {
                    continue;
                }
                
                if (room[nr].charAt(nc) == 'X') {
                    continue;
                }
                
                if (room[nr].charAt(nc) == 'P') {
                    return false;
                }
                
                visited[nr][nc] = true;
                que.offer(new int[]{nr, nc, distance + 1});
            }
        }
        
        return true;
    }
}