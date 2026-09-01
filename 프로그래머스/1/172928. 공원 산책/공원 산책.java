class Solution {
    public int[] solution(String[] park, String[] routes) {
        
        int startR = 0;
        int startC = 0;
        boolean start = false;
        for(int r = 0; r < park.length; r++){
            for(int c = 0; c < park[r].length(); c++){
                char ch = park[r].charAt(c);
                
                if(ch == 'S'){
                    startR = r;
                    startC = c;
                    start = true;
                }
                if(start){
                    break;
                }
            }
            if(start){
                    break;
                }
        }
        
        int mapR = park.length;
        int mapC = park[0].length();
        
        String[] cols = new String[mapC];
        for(int c = 0; c < mapC; c++){
            StringBuilder sb = new StringBuilder();
            
            for(int r = 0; r < mapR; r++){
                sb.append(park[r].charAt(c));
            }
            
            cols[c] = sb.toString();
        }
        
        for(int i = 0; i < routes.length; i++){
            
            String[] route = routes[i].split(" ");
            String arrow = route[0];
            int num = Integer.parseInt(route[1]);
            
            if(arrow.equals("E")){
                
                if(startC + num >= mapC) {
                    continue;
                }
                
                String st = park[startR].substring(startC + 1, startC + num + 1);
                if(!st.contains("X")){
                    startC += num;
                }
                
            } else if(arrow.equals("W")) {
                
                if(startC - num < 0) {
                    continue;
                }
                
                String st = park[startR].substring(startC - num, startC);
                if(!st.contains("X")){
                    startC -= num;
                }
                
            } else if(arrow.equals("S")) {
                
                if(startR + num >= mapR) {
                    continue;
                }
                
                String st = cols[startC].substring(startR + 1, startR + num + 1);
                if(!st.contains("X")){
                    startR += num;
                }
                
            } else if(arrow.equals("N")) {
                
                if(startR - num < 0) {
                    continue;
                }
                
                String st = cols[startC].substring(startR - num, startR);
                if(!st.contains("X")){
                    startR -= num;
                }
                
            }
            
        }
        
        int[] result = {startR, startC};
        
        
        return result;
    }
}