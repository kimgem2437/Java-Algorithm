import java.util.*;

class Solution {
    public int[] solution(String msg) {
        
        List<Integer> list = new LinkedList<>();
        Map<String, Integer> map = new HashMap<>();
        
        for(int i = 0; i < 26; i++){
            map.put(String.valueOf((char)('A' + i)), i + 1);
        }
        
        int dictIndex = 27;
        int index = 0;
        
        while (index < msg.length()) {
            
            String w = "";
            int next = index;
            
            while (next < msg.length()) {
                String temp = msg.substring(index, next + 1);
                
                if (map.containsKey(temp)) {
                    w = temp;
                    next++;
                } else {
                    break;
                }
            }
            
            list.add(map.get(w));
            
            if (next < msg.length()) {
                String newWord = msg.substring(index, next + 1);
                map.put(newWord, dictIndex++);
            }
            
            index += w.length();
        }
        
        int[] result = new int[list.size()];
        
        for(int i = 0; i < list.size(); i++){
            result[i] = list.get(i);
        }
        
        return result;
    }
}