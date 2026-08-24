import java.util.*;

class Solution {
    public int solution(String[][] book_time) {
        
        int[][] times = new int[book_time.length][2];
        
        for(int i = 0; i < book_time.length; i++){
            times[i][0] = toMinute(book_time[i][0]);
            times[i][1] = toMinute(book_time[i][1]) + 10;
        }
        
        Arrays.sort(times, (a, b) -> a[0] - b[0]);
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for(int i = 0; i < times.length; i++){
            
            int start = times[i][0];
            int end = times[i][1];
            
            if(!pq.isEmpty() && pq.peek() <= start){
                pq.poll();
            }
            
            pq.offer(end);
        }
        
        return pq.size();
    }
    
    public int toMinute(String time) {
        
        String[] st = time.split(":");
        
        int hour = Integer.parseInt(st[0]);
        int minute = Integer.parseInt(st[1]);
        
        return hour * 60 + minute;
        
        
    }
}