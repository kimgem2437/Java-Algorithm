import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        
        Queue<Integer> que = new LinkedList<>();
        
        for(int i = 0; i < progresses.length; i++){
            int day = (100 - progresses[i] + speeds[i] - 1) / speeds[i];
            que.offer(day);
        }
        
        ArrayList<Integer> list = new ArrayList<>();
        
        while(!que.isEmpty()){
            int releaseday = que.poll();
            int count = 1;
            
            while(!que.isEmpty() && que.peek() <= releaseday) {
                que.poll();
                count++;
            }
            
            list.add(count);
        }
        
        int[] result = new int[list.size()];
        
        for(int i = 0; i < list.size(); i++){
            result[i] = list.get(i);
        }
        
        return result;
    }
}