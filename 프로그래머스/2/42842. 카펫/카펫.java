class Solution {
    public int[] solution(int brown, int yellow) {
        
        for(int i = 1; i <= yellow; i++){
            
            if(yellow % i != 0){
                continue;
            }
            
            int yellowH = yellow / i;
            
            int height = yellowH + 2;
            int width = i + 2;
            
            int brownC = height * width - yellow;
            
            if(brown == brownC){
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