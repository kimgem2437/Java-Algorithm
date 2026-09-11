class Solution {
    
    int result = 0;
    
    public int solution(int[] numbers, int target) {
                
        dfs(0, 0, numbers, target);
        
        return result;
    }
    
    public void dfs(int sum, int index, int[] numbers, int target){
        
        if(index == numbers.length){
            if(sum == target){
                result++;
            }
            return;
        }
        
        dfs(sum + numbers[index], index + 1, numbers, target);
        dfs(sum - numbers[index], index + 1, numbers, target);

    }
}