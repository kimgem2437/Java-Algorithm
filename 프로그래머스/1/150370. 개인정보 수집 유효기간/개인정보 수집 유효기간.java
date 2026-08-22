import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        
        List<Integer> list = new LinkedList<>();
        
        String[] todaySt = today.split("[.]");
        
        int year = Integer.parseInt(todaySt[0]);
        int month = Integer.parseInt(todaySt[1]);
        int day = Integer.parseInt(todaySt[2]);
    
        int total = (28 * 12 * year) + (28 * month) + day;
        
        HashMap<String, Integer> map = new HashMap<>();
        
        for(int i = 0; i < terms.length; i++) {
            String[] sp = terms[i].split(" ");
            String st = sp[0];
            int num = Integer.parseInt(sp[1]);
            
            map.put(st, num);
        }
        
        for(int i = 0; i < privacies.length; i++) {
            
            String[] sp = privacies[i].split("[. ]");
            
            int priYear = Integer.parseInt(sp[0]);
            int priMonth = Integer.parseInt(sp[1]);
            int priDay = Integer.parseInt(sp[2]);
            String type = sp[3];
            
            int last = map.get(type);
            
            int priTotal = (28 * 12 * priYear) + (28 * (priMonth + last)) + priDay - 1;
            
            if(total > priTotal){
                list.add(i + 1);
            }
            
        }
        
        int[] result = new int[list.size()];
        
        for(int i = 0; i < list.size(); i++){
            result[i] = list.get(i);
        }
        
        return result;
    }
}