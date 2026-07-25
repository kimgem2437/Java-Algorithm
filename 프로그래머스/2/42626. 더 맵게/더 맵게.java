import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        
        int result = 0;
        
        for(int i = 0; i < scoville.length; i++){
            heap.offer(scoville[i]);
        }
        
        while(heap.peek() < K){
            
            if(heap.size() <= 1) {
                return -1;
            }
            
            int min = heap.poll();
            int minsco = heap.poll();
            
            int mix = min + (minsco * 2);
            heap.offer(mix);
            
            result++;
            
        }
        
        return result;
    }
}