class Solution {
    public int solution(int[] ingredient) {
        
        StringBuilder sb = new StringBuilder();
        int result = 0;
        
        for(int i = 0; i < ingredient.length; i++) {
            
            sb.append(ingredient[i]);
            int len = sb.length();
            
            if(len >= 4 && sb.substring(len - 4).equals("1231")) {
                sb.delete(len - 4, len);
                result++;
            }
            
        }
        
        
        
        return result;
    }
}