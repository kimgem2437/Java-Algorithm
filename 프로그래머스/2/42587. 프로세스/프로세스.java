import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {

        int result = 0;
        Queue<int[]> que = new LinkedList<>();
        
        for(int i = 0; i < priorities.length; i++){
            que.offer(new int[]{priorities[i] , i});
        }
        
        while(!que.isEmpty()){
            
            int[] x = que.poll();
            int pro = x[0];
            int index = x[1];
            
            boolean high = false;
            
            for(int[] nums : que) {
                
                int next = nums[0];
                
                if(next > pro){
                    high = true;
                    break;
                }
            }
            
            if(high){
                que.offer(x);
            } else {
                result++;
                
                if(index == location){
                    return result;
                }
            }
        }
        
        return result;
    }
}