import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        
        Queue<int[]> que = new LinkedList<>();
        
        for(int i = 0; i < priorities.length; i++){
            que.offer(new int[]{priorities[i], i});
        }
        
        int result = 0;
        
        while(!que.isEmpty()){
            
            int[] now = que.poll();
            boolean isok = false;
            
            for(int[] process : que){
                if(now[0] < process[0]){
                    isok = true;
                    break;
                }
            }
            
            if(isok){
                que.offer(now);
            } else {
                result++;
                
                if(now[1] == location){
                    return result;
                }
            }
            
        }
        
        return result;
    }
}