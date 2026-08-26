import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        
        Set<String> set = new HashSet<>();
        Map<String, Integer> reportMap = new HashMap<>();
        Map<String, Integer> mail = new HashMap<>();
        
        for(int i = 0; i < id_list.length; i++){
            mail.put(id_list[i], 0);
            reportMap.put(id_list[i], 0);
        }
        
        for(int i = 0; i < report.length; i++){
            set.add(report[i]);
        }
        
        for(String r : set){
            String[] sp = r.split(" ");
            
            String reporter = sp[0];
            String target = sp[1];
            
            reportMap.put(target, reportMap.get(target) + 1);
        }
        
        for(String r : set){
            String[] sp = r.split(" ");
            
            String reporter = sp[0];
            String target = sp[1];
            
            if(reportMap.get(target) >= k){
                mail.put(reporter, mail.get(reporter) + 1);
            }
        }
        
        int[] result = new int[id_list.length];
        
        for(int i = 0; i < result.length; i++) {
            result[i] = mail.get(id_list[i]);
        }
        
        return result;
    }
}