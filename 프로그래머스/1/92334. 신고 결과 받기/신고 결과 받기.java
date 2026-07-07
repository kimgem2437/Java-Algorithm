import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        
        ArrayList<String> list = new ArrayList<>();
        HashSet<String> set = new HashSet<>();
        
        for(int i = 0; i < report.length; i++) {
            if(!set.contains(report[i])) {
                set.add(report[i]);
                list.add(report[i]);
            }
        }
        
        String[] delete = new String[list.size()];
        
        for(int i = 0; i < list.size(); i++) {
            delete[i] = list.get(i);
        }
                
        
        HashMap<String, Integer> map = new HashMap<>();
        for(int i = 0; i < id_list.length; i++) {
            map.put(id_list[i], i);
        }
        
        int[] count = new int[id_list.length];
        
        for(int i = 0; i < delete.length; i++) {
            String[] id = delete[i].split(" ");
            String userId = id[0];
            String reportId = id[1];
            
            int reportIdx = map.get(reportId);
            count[reportIdx]++;
            
        }
        
        int[] answer = new int[id_list.length];
        
        for(int i = 0; i < delete.length; i++) {
            String[] id = delete[i].split(" ");
            
            String userId = id[0];
            String reportId = id[1];
            
            int userIdx = map.get(userId);
            int reportIdx = map.get(reportId);
            
            if(count[reportIdx] >= k) {
                answer[userIdx]++;
            }
        }
        
        return answer;
        
    }
}