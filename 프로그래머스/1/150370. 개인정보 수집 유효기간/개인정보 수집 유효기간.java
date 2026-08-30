import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        
        String[] todayST = today.split("[.]");
        
        int todayTotal = (Integer.parseInt(todayST[0]) * 12 * 28) + (Integer.parseInt(todayST[1]) * 28) +
            (Integer.parseInt(todayST[2]));
        
        Map<String, Integer> map = new HashMap<>();
        
        for(int i = 0; i < terms.length; i++){
            String[] st = terms[i].split(" ");
            Integer num = Integer.parseInt(st[1]);
            map.put(st[0], num);
        }
        
        List<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < privacies.length; i++){
            
            String[] st = privacies[i].split("[. ]");
            int year = Integer.parseInt(st[0]) * 12 * 28;
            int month = Integer.parseInt(st[1]) * 28;
            int day = Integer.parseInt(st[2]);
            String type = st[3];
            int last = map.get(type);
            int priTotal = year + month + day + (last * 28);
            
            if(todayTotal >= priTotal){
                list.add(i + 1);
            }
        }
        
        int[] result = new int[list.size()];
        
        for(int i = 0; i < list.size(); i++){
            result[i] = list.get(i);
        }
        
        Arrays.sort(result);
        
        
        return result;
    }
}