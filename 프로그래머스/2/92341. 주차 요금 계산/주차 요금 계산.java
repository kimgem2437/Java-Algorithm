import java.util.*;

class Solution {
    
    Map<String, Integer> map = new HashMap<>();
    Map<String, Integer> total = new TreeMap<>();
    
    public int[] solution(int[] fees, String[] records) {
        
        for(int i = 0; i < records.length; i++){
            
            String[] sp = records[i].split("[: ]");
            
            int hour = Integer.parseInt(sp[0]);
            int minute = Integer.parseInt(sp[1]);
            String number = sp[2];
            String status = sp[3];
            
            int time = hour * 60 + minute;
            
            if(status.equals("IN")) {
                map.put(number, time);
            } else {
                int inTime = map.get(number);
                int parkingTime = time - inTime;
                
                total.put(number, total.getOrDefault(number, 0) + parkingTime);
                map.remove(number);
            }
        }
        
        int endTime = 23 * 60 + 59;
        
        for(String number : map.keySet()){
            int inTime = map.get(number);
            int parkingTime = endTime - inTime;
            
            total.put(number, total.getOrDefault(number, 0) + parkingTime);
        }
        
        int[] result = new int[total.size()];
        int index = 0;
        
        for(String number : total.keySet()) {
            int time = total.get(number);
            
            if(time <= fees[0]){
                result[index++] = fees[1];
            } else {
                int over = time - fees[0];
                int unit = (int) Math.ceil((double) over / fees[2]);
                result[index++] = fees[1] + unit * fees[3];
            }
        }
        
        return result;
    }
}