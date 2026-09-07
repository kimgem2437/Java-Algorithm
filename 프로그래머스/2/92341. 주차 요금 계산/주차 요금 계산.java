import java.util.*;

class Solution {
    public int[] solution(int[] fees, String[] records) {
        
        Map<String, Integer> map = new HashMap<>();
        TreeMap<String, Integer> sort = new TreeMap<>();
        
        for(int i = 0; i < records.length; i++){
            
            String[] park = records[i].split("[: ]");
            
            int time = Integer.parseInt(park[0]) * 60 + Integer.parseInt(park[1]);
            String carNumber = park[2];
            String state = park[3];
            
            sort.putIfAbsent(carNumber, 0);
            
            if(state.equals("IN")){
                map.put(carNumber, time);
            } else {
                int inTime = map.get(carNumber);
                int useTime = time - inTime;
                
                sort.put(carNumber, sort.get(carNumber) + useTime);
                map.remove(carNumber);
            }
        }
        
        int end = 23 * 60 + 59;
        
        for(String carNumber : map.keySet()){
            
            int inTime = map.get(carNumber);
            int usedTime = end - inTime;
            
            sort.put(carNumber, sort.get(carNumber) + usedTime);
        }
        
        int[] result = new int[sort.size()];
        int index = 0;
        
        for(String carNumber : sort.keySet()){
            int totalTime = sort.get(carNumber);
            result[index++] = fee(totalTime, fees);
        }
        
        return result;
    }
    
    public int fee(int totalTime, int[] fees){
        
        int basicTime = fees[0];
        int basicFee = fees[1];
        int unitTime = fees[2];
        int unitFee = fees[3];
        
        if(totalTime <= basicTime){
            return basicFee;
        }
        
        int extraTime = totalTime - basicTime;
        int unitCount = (extraTime + unitTime - 1) / unitTime;
        
        return basicFee + unitCount * unitFee;
    }
}