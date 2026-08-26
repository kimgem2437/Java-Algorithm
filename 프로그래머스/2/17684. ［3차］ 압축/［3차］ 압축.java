import java.util.*;

class Solution {
    public int[] solution(String msg) {
        
        Map<String, Integer> dict = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < 26; i++){
            char c = (char)('A' + i);
            dict.put(String.valueOf(c), i + 1);
        }
        
        int index = 0;
        int dictNum = 27;
        
        while(index < msg.length()){
            
            String w = "";
            int nextIndex = index;
            
            while(nextIndex < msg.length()){
                String temp = msg.substring(index, nextIndex + 1);
                
                if(dict.containsKey(temp)){
                    w = temp;
                    nextIndex++;
                } else {
                    break;
                }
            }
            
            list.add(dict.get(w));
            
            if(nextIndex < msg.length()){
                String newWord = msg.substring(index, nextIndex + 1);
                dict.put(newWord, dictNum++);
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