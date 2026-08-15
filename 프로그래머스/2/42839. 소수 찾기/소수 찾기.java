import java.util.*;

class Solution {
    
    Set<Integer> set = new HashSet<>();
    boolean[] visited;
    
    public int solution(String numbers) {
        
        visited = new boolean[numbers.length()];
        
        dfs(numbers, "");
        
        int result = 0;
        
        for(int num : set) {
            if(prime(num)) {
                result++;
            }
        }
        
        return result;
        
    }
    
    public void dfs(String numbers, String current) {
        
        if(!current.equals("")){
            set.add(Integer.parseInt(current));
        }
        
        for(int i = 0; i < numbers.length(); i++){
            
            if(visited[i]){
                continue;
            }
            
            visited[i] = true;
            dfs(numbers, current + numbers.charAt(i));
            visited[i] = false;
        }
        
        
    }
    
    public boolean prime(int num) {
        
        if(num < 2){
            return false;
        }
        
        for(int i = 2; i * i <= num; i++) {
            
            if(num % i == 0) {
                return false;
            }
            
        }
        
        return true;
    }
}