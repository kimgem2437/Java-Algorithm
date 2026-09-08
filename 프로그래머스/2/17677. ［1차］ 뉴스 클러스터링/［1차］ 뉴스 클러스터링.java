import java.util.*;

class Solution {
    public int solution(String str1, String str2) {
        
        Map<String, Integer> map1 = makeMap(str1);
        Map<String, Integer> map2 = makeMap(str2);
        
        Set<String> keys = new HashSet<>();
        keys.addAll(map1.keySet());
        keys.addAll(map2.keySet());
        
        int intersection = 0;
        int union = 0;
        
        for (String key : keys) {
            int count1 = map1.getOrDefault(key, 0);
            int count2 = map2.getOrDefault(key, 0);
            
            intersection += Math.min(count1, count2);
            union += Math.max(count1, count2);
        }
        
        if (union == 0) {
            return 65536;
        }
        
        return (int)((double) intersection / union * 65536);
    }
    
    public Map<String, Integer> makeMap(String str) {
        
        Map<String, Integer> map = new HashMap<>();
        str = str.toUpperCase();
        
        for (int i = 0; i < str.length() - 1; i++) {
            String word = str.substring(i, i + 2);
            
            char a = word.charAt(0);
            char b = word.charAt(1);
            
            if (a >= 'A' && a <= 'Z' && b >= 'A' && b <= 'Z') {
                map.put(word, map.getOrDefault(word, 0) + 1);
            }
        }
        
        return map;
    }
}