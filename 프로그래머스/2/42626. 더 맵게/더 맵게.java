import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        
        PriorityQueue<Long> pq = new PriorityQueue<>();
        
        for(int i = 0; i < scoville.length; i++){
            pq.offer((long)scoville[i]);
        }
        
        int result = 0;
        
        while(pq.peek() < K){
            
            if(pq.size() < 2){
                return -1;
            }
            
            long one = pq.poll();
            long two = pq.poll();
            long sum = one + two * 2;
            pq.offer(sum);
            result++;
        }
        
        return result;
    }
}