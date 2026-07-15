import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < numbers.length; i++) {
            
            for(int j = i + 1; j < numbers.length; j++) {
                
                int sum = numbers[i] + numbers[j];
                    list.add(sum);
            } 
            
        }
        
        TreeSet<Integer> set = new TreeSet<>(list);        
        int[] result = new int[set.size()];
        
        int idx = 0;
        
        for(int num : set) {
            result[idx] = num;
            idx++;
        }
        
        return result;
        
    }
}