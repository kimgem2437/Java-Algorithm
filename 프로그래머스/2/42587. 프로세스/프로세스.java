import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        
        Queue<int[]> que = new LinkedList<>();
        
        for(int i = 0; i < priorities.length; i++){
            que.offer(new int[]{priorities[i], i});
        }
        
        int order = 0;
        
        while(!que.isEmpty()) {
            
            int[] current = que.poll();
            int priority = current[0];
            int index = current[1];
            
            boolean hasHigher = false;
            
            for(int[] process : que){
                if(process[0] > priority){
                    hasHigher = true;
                    break;
                }
            }
            
            if(hasHigher) {
                que.offer(current);
            } else {
                order++;
                
                if(index == location){
                    return order;
                }
            }
        }
        
        return -1;
    }
}