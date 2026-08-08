class Solution {
    
    int result = 0;
    
    public int solution(int[] numbers, int target) {
        
        dfs(numbers, target, 0, 0);
        
        return result;
    }
    
    public void dfs(int[] numbers, int target, int index, int sum){
        
        if(index == numbers.length){
            if(sum == target){
                result++;
            }
            return;
        }
        
        dfs(numbers, target, index + 1, sum + numbers[index]);
        dfs(numbers, target, index + 1, sum - numbers[index]);
        
    }
}