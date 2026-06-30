class Solution {
    public int[] solution(String[] wallpaper) {
        
        int cMin = Integer.MAX_VALUE;
        int cMax = Integer.MIN_VALUE;
        int rMin = Integer.MAX_VALUE;
        int rMax = Integer.MIN_VALUE;
        
        for(int i = 0; i < wallpaper.length; i++) {
            
            for(int j = 0; j < wallpaper[i].length(); j++){
                
                char c = wallpaper[i].charAt(j);
                
                if(c == '#'){
                    if(cMin > j) {
                        cMin = j;
                    }
                    if(cMax < j) {
                        cMax = j;
                    }
                    if(rMin > i) {
                        rMin = i;
                    }
                    if(rMax < i) {
                        rMax = i;
                    }
                }
            }
                
        }
        
        int[] answer = {rMin, cMin, rMax + 1, cMax + 1};
        
        return answer;
    }
}