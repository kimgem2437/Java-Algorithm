import java.util.*;

class Solution {
    
    ArrayList<Integer>[] graph;
    
    public int solution(int n, int[][] wires) {
        
        int answer = n;
        
        graph = new ArrayList[n + 1];
        
        for(int i = 1; i <= n; i++){
            graph[i] = new ArrayList<>();
        }
        
        for(int i = 0; i < wires.length; i++){
            int a = wires[i][0];
            int b = wires[i][1];
            
            graph[a].add(b);
            graph[b].add(a);
        }
        
        for(int i = 0; i < wires.length; i++){
            int cutA = wires[i][0];
            int cutB = wires[i][1];
            
            int count = bfs(1, n, cutA, cutB);
            int other = n - count;
            
            answer = Math.min(answer, Math.abs(count - other));
        }
        
        return answer;
    }
    
    public int bfs(int start, int n, int cutA, int cutB){
        
        boolean[] visited = new boolean[n + 1];
        Queue<Integer> que = new LinkedList<>();
        
        que.offer(start);
        visited[start] = true;
        
        int count = 0;
        
        while(!que.isEmpty()){
            
            int now = que.poll();
            count++;
            
            for(int next : graph[now]){
                
                if(visited[next]){
                    continue;
                }
                
                if((now == cutA && next == cutB) || (now == cutB && next == cutA)){
                    continue;
                }
                
                visited[next] = true;
                que.offer(next);
                
            }
        }
        
        return count; 
    }
}