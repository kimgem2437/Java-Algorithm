import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        
        List<Integer> list = new LinkedList<>();
        
        Queue<Integer> que = new LinkedList<>();
        
        for(int i = 0; i < progresses.length; i++){
            
            int remain = 100 - progresses[i];
            
            int day ;
            if(remain % speeds[i] == 0){
                day = remain / speeds[i];
            } else {
                day = remain / speeds[i] + 1;
            }
            
            que.offer(day);
        }
        
        
        while(!que.isEmpty()){
            
            int day = que.poll();
            int cnt = 1;
            
            while(!que.isEmpty() && que.peek() <= day){
                que.poll();
                cnt++;
            }
            
            list.add(cnt);
        }
        
        int[] result = new int[list.size()];
        
        for(int i = 0; i < list.size(); i++){
            result[i] = list.get(i);
        }
            
        
        return result;
    }
}