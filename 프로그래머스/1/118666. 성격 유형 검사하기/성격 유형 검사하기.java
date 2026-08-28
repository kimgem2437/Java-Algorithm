import java.util.*;

class Solution {
    public String solution(String[] survey, int[] choices) {
        StringBuilder sb = new StringBuilder();
        
        Map<Character, Integer> map = new HashMap<>();
        
        char[] types = {'R', 'T', 'C', 'F', 'J', 'M', 'A', 'N'};
        
        for(char type : types){
            map.put(type, 0);
        }
        
        for(int i = 0; i < survey.length; i++){
            char[] c = survey[i].toCharArray();
            
            char not = c[0];
            char ok = c[1];
            
            int choice = choices[i];
            int score = Math.abs(choice - 4);
            
            if(choice < 4){
                map.put(not, map.get(not) + score);
            } else if(choice > 4){
                map.put(ok, map.get(ok) + score);
            }
        }
        
        if(map.get('R') >= map.get('T')){
            sb.append('R');
        } else if(map.get('R') < map.get('T')){
            sb.append('T');
        }
        
        if(map.get('C') >= map.get('F')){
            sb.append('C');
        } else if(map.get('C') < map.get('F')){
            sb.append('F');
        }
        
        if(map.get('J') >= map.get('M')){
            sb.append('J');
        } else if(map.get('J') < map.get('M')){
            sb.append('M');
        }
        
        if(map.get('A') >= map.get('N')){
            sb.append('A');
        } else if(map.get('A') < map.get('N')){
            sb.append('N');
        }
        
        
        return sb.toString();
    }
}