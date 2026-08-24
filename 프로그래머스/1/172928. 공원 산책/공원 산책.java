class Solution {
    
    int[][] map;
    
    public int[] solution(String[] park, String[] routes) {
        
        map = new int[park.length][park[0].length()];
        
        int r = park.length;
        int c = park[0].length();
            
        int disR = 0;
        int disC = 0;
            
        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++){
                
                char ch = park[i].charAt(j);
                
                if(ch == 'S') {
                    map[i][j] = 1;
                    
                    disR = i;
                    disC = j;
                    
                } else if(ch == 'O') {
                    map[i][j] = 0;
                    
                } else {
                    map[i][j] = -1;
                }
                
            }
        }
        
        for(int i = 0; i < routes.length; i++) {
            
            String[] st = routes[i].split(" ");
            String ewsn = st[0];
            int num = Integer.parseInt(st[1]);
            
            if(ewsn.equals("E") && isok(ewsn, num, disR, disC)){
                disC += num;
            } else if(ewsn.equals("W") && isok(ewsn, num, disR, disC)){
                disC -= num;
            } else if(ewsn.equals("S") && isok(ewsn, num, disR, disC)){
                disR += num;
            } else if(ewsn.equals("N") && isok(ewsn, num, disR, disC)){
                disR -= num;
            }
                
        }
        
        int[] result = {disR, disC};
        
        return result;
    }
    
    public boolean isok(String ewsn, int num, int disR, int disC){
        
        int r = map.length;
        int c = map[0].length;
        
        for(int i = 1; i <= num; i++) {
            if(ewsn.equals("E")){
                if(disC + 1 >= c || map[disR][disC + 1] == -1) {
                    return false;
                } else {
                    disC++;
                }
            }
            
            if(ewsn.equals("W")){
                if(disC - 1 < 0 || map[disR][disC - 1] == -1) {
                    return false;
                } else {
                    disC--;
                }
            }
            
            if(ewsn.equals("S")){
                if(disR + 1 >= r || map[disR + 1][disC] == -1) {
                    return false;
                } else {
                    disR++;
                }
            }
            
            if(ewsn.equals("N")){
                if(disR - 1 < 0 || map[disR - 1][disC] == -1) {
                    return false;
                } else {
                    disR--;
                }
            }
        }
        
        return true;
    }
}