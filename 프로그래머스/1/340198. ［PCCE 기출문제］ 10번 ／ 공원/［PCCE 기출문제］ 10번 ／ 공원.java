class Solution {
    public int solution(int[] mats, String[][] park) {
        int answer = -1;
        
        int h = park.length;
        int w = park[0].length;
        
        int[][] dp = new int[h][w];
        int maxSize = 0;
        
        for(int i = 0; i < h; i++) {
            for(int j = 0; j < w; j++) {
                
                if(park[i][j].equals("-1")) {
                    
                    if(i == 0 || j == 0) {
                        dp[i][j] = 1;
                    } else {
                        dp[i][j] = Math.min(Math.min(dp[i - 1][j], dp[i][j - 1]), dp[i - 1][j - 1]) + 1;
                    }
                }
                
                maxSize = Math.max(maxSize, dp[i][j]);
                
            }
        }
        
        for(int i = 0; i < mats.length; i++) {
            if(mats[i] <= maxSize) {
                answer = Math.max(answer, mats[i]);
            }
        }
        
        
        return answer;
    }
}