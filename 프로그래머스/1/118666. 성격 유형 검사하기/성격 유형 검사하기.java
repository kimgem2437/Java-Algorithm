import java.util.*;

class Solution {
    public String solution(String[] survey, int[] choices) {
        
        Map<String, Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        
        String[] sur = {"R", "T", "C", "F", "J", "M", "A", "N"};
        
        for(int i = 0; i < sur.length; i++){
            map.put(sur[i], 0);
        }
        
        for(int i = 0; i < choices.length; i++){
            
            char[] c = survey[i].toCharArray();
            
            if(choices[i] - 4 < 0){
                map.put(String.valueOf(c[0]), 
                        map.get(String.valueOf(c[0])) + Math.abs(choices[i] - 4));
            } else if(choices[i] - 4 > 0){
                map.put(String.valueOf(c[1]), 
                        map.get(String.valueOf(c[1])) + choices[i] - 4);
            }
            
        }
        
        for(int i = 0; i < 8; i+=2){
            
            if(map.get(sur[i]) >= map.get(sur[i + 1])){
                sb.append(sur[i]);
            } else{
                sb.append(sur[i + 1]);
            }
            
        }
        
        return sb.toString();
        
    }
}