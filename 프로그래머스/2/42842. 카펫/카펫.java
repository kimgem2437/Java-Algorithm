class Solution {
    public int[] solution(int brown, int yellow) {
        
        for(int i = 1; i <= yellow; i++){
            
            if(yellow % i != 0){
                continue;
            }
            
            int yellowW = yellow / i;
            
            int width = yellowW + 2;
            int height =  i + 2;
            
            int brownW = width * height - yellow;
            
            if(brownW == brown){
                if(width >= height) {
                    return new int[]{width, height};
                } else {
                    return new int[]{height, width};
                }
            }
        }
        
        return new int[]{};
    }
}