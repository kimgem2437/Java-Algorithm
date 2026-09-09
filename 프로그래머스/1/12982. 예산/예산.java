import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
        
        int money = budget;
        
        Arrays.sort(d);
        int result = 0;
        
        for(int i = 0; i < d.length; i++){
            
            money -= d[i];
            if(money >= 0){
                result++;
            } else {
                break;
            }
            
        }
        
        
        return result;
    }
}