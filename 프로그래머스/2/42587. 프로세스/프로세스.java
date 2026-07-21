import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        
        Queue<int[]> queue = new LinkedList<>();
        
        for (int i = 0; i < priorities.length; i++) {
            queue.offer(new int[]{priorities[i], i});
        }
        
        int answer = 0;
        
        while (!queue.isEmpty()) {
            
            int[] now = queue.poll();
            
            boolean hasHigher = false;
            
            for (int[] process : queue) {
                if (process[0] > now[0]) {
                    hasHigher = true;
                    break;
                }
            }
            
            if (hasHigher) {
                queue.offer(now);
            } else {
                answer++;
                
                if (now[1] == location) {
                    return answer;
                }
            }
        }
        
        return answer;
    }
}