import java.util.*;

class Solution {
    public int[] solution(int[] prices) {
        
        int[] result = new int[prices.length];
        
        Queue<Integer> que = new LinkedList<>();
        
        for(int i = 0; i < prices.length; i++){
            que.offer(prices[i]);
        }
        
        int index = 0;
        
        while(!que.isEmpty()){
            
            int num = que.poll();
            int cnt = 0;
            
            for(int nums : que){
                if(nums < num){
                    cnt++;
                    break;
                } else {
                    cnt++;
                }
            }
            
            result[index] = cnt;
            index++;
        }
        
        return result;
    }
}