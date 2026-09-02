import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        
        Set<String> set = new HashSet<>();
        HashMap<String, Integer> map = new HashMap<>();
        HashMap<String, StringBuilder> mapString = new HashMap<>();
        
        for(int i = 0; i < id_list.length; i++){
            map.put(id_list[i], 0);
            mapString.put(id_list[i], new StringBuilder());
        }
        
        for(int i = 0; i < report.length; i++){
            set.add(report[i]);
        }
        
        for(String rep : set){
            String[] st = rep.split(" ");
            
            String reporter = st[0];
            String user = st[1];
            
            map.put(user, map.get(user) + 1);
            mapString.get(reporter).append(user).append(" ");
        }
        
        int[] result = new int[id_list.length];
        
        for(int i = 0; i < id_list.length; i++){
            
            String st = mapString.get(id_list[i]).toString();
            
            if(st.equals("")){
                result[i] = 0;
                continue;
            }
            
            String[] stb = st.split(" ");
            int cnt = 0;
            
            for(int j = 0; j < stb.length; j++){
                if(map.get(stb[j]) >= k){
                    cnt++;
                }
            }
            
            result[i] += cnt;
        }
        
        return result;
    }
}