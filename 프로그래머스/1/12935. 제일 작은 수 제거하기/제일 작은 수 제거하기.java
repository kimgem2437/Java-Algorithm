import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        
        ArrayList<Integer> list = new ArrayList<>();
        
        int min = Integer.MAX_VALUE;
        
        for(int i = 0; i < arr.length; i++) {
            
            min = Math.min(min, arr[i]);
            
        }
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != min) {
                list.add(arr[i]);
            }
        }
        
        int[] zero = {-1};
        
        if(list.size() == 0) {
            return zero;
        }
        
        int[] result = new int[list.size()];
        
        for(int i = 0; i < list.size(); i++){
            result[i] = list.get(i);
        }
        
        
        return result;
    }
}