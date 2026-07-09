class Solution {
    public int solution(int n, int w, int num) {
        
        int h = (int) Math.ceil((double)n/w);
        
        int[][] box = new int[h][w];

        int boxNum = 1;
        
        int numR = 0;
        int numC = 0;
        
        for(int i = 0; i < h; i++) {
            
            
            
            if(i % 2 == 0) {
            for(int j = 0; j < w; j++) {
                
                if(boxNum > n) break;
                
                box[i][j] = boxNum;
                if(num == boxNum) {
                        numR = i;
                        numC = j;
                    }
                boxNum++;
                
            }
            } else {
                for(int j = w-1; j >= 0; j--){
                    
                    if(boxNum > n) break;
                    
                    box[i][j] = boxNum;
                    if(num == boxNum) {
                        numR = i;
                        numC = j;
                    }
                    boxNum++;

                }
            }
        }
        
        int answer;
        
        if(box[h-1][numC] == 0){
            answer = h-1 - numR;
        } else {
            answer = h - numR; 
        }
        
        return answer;
    }
}