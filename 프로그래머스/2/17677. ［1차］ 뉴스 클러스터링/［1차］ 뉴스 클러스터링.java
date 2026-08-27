import java.util.*;
    
class Solution {
    public int solution(String str1, String str2) {
        
        Map<String, Integer> map1 = makeMap(str1);
        Map<String, Integer> map2 = makeMap(str2);
        
        int intersection = 0;
        int union = 0;
        
        for(String key : map1.keySet()) {
            
            int cnt1 = map1.get(key);
            int cnt2 = map2.getOrDefault(key, 0);
            
            intersection += Math.min(cnt1, cnt2);
            union += Math.max(cnt1, cnt2);
        }
        
        for(String key : map2.keySet()){
            if(!map1.containsKey(key)) {
                union += map2.get(key);
            }
        }
        
        
        if(union == 0) {
            return 65536;
        }
        
        return (int)((double) intersection / union * 65536);
    }
    
    public Map<String, Integer> makeMap(String str) {
        
        Map<String, Integer> map = new HashMap<>();
        
        str = str.toUpperCase();
        
        for(int i = 0; i < str.length() - 1; i++){
            
            char first = str.charAt(i);
            char second = str.charAt(i + 1);
            
            if(first >= 'A' && first <= 'Z' && second >= 'A' && second <= 'Z') {
                
                String word = str.substring(i, i + 2);
                
                map.put(word, map.getOrDefault(word, 0) + 1);
            }
            
        }
        
        
        return map;
    }
}