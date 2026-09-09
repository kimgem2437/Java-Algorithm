import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        
        Arrays.sort(tangerine);
        int max = tangerine[tangerine.length - 1];
        
        int[] num = new int[max + 1];
        Integer[] index = new Integer[max + 1];
        
        for(int i = 0; i < tangerine.length; i++){
            num[tangerine[i]]++;
        }
        
        for(int i = 0; i < index.length; i++){
            index[i] = i;    
        }
        
        Arrays.sort(index, (a, b) -> {
            if(num[a] == num[b]){
                return a - b;
            }
            return num[b] - num[a];
        });
        
        int result = 0;
        int sum = k;
        
        for(int i = 0; i < index.length; i++){
            
            int size = index[i];
            
            if(num[size] == 0){
                break;
            }
            
            sum -= num[size];
            result++;
            
            if(sum <= 0){
                break;
            }
        }
        
        
        return result;
    }
}