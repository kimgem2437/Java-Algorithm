import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        ArrayList<Integer> list = new ArrayList<>();
        
        String[] todayInfo = today.split("\\.");
        int todayYear = Integer.parseInt(todayInfo[0]);
        int todayMonth = Integer.parseInt(todayInfo[1]);
        int todayDay = Integer.parseInt(todayInfo[2]);
        
        int todayTotal = todayYear * 12 * 28 + todayMonth * 28 + todayDay; 
        
        for(int i = 0; i < privacies.length; i++) {
            
            char privaciesType = privacies[i].charAt(11);
            String[] privaciesSplit = privacies[i].split(" ");
            String[] privaciesInfo = privaciesSplit[0].split("\\.");
            
            int privaciesYear = Integer.parseInt(privaciesInfo[0]);
            int privaciesMonth = Integer.parseInt(privaciesInfo[1]);
            int privaciesDay = Integer.parseInt(privaciesInfo[2]);
            
            int privaciesTotal = privaciesYear * 12 * 28 + privaciesMonth * 28 + privaciesDay;
            
            for(int j = 0; j < terms.length; j++) {
                
                char termsType = terms[j].charAt(0);
                
                if(privaciesType == termsType) {
                    
                    String[] termInfo = terms[j].split(" ");
                    int month = Integer.parseInt(termInfo[1]);
                    
                    privaciesTotal += month * 28;
                    break;
                    
                }
                
            }

            if(todayTotal >= privaciesTotal) {
                list.add(i+1);
            }
            
        }
        
        int[] answer = new int[list.size()];
        
        for(int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
        
        
        
    }
}