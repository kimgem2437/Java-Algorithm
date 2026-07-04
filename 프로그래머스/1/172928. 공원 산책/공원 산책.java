class Solution {
    public int[] solution(String[] park, String[] routes) {
        
        
        int startC = 0;
        int startR = 0;
        
        for(int i = 0; i < park.length; i++) {
            
            for(int j = 0; j < park[i].length(); j++){
                
                if(park[i].charAt(j) == 'S') {
                    startC = j;
                    startR = i;
                    break;
                }
            }
        }
        
        for(int i = 0; i < routes.length; i++) {
            
            String[] compass = routes[i].split(" ");
            String site = compass[0];
            int num = Integer.parseInt(compass[1]);
            boolean isok = true;
            
            for(int j = 1; j <= num; j++) {
                
                if(site.equals("E")){
                    
                    int mapE = num + startC;
                    
                    if(mapE >= park[0].length() || park[startR].charAt(startC + j) == 'X') {
                        isok = false;
                        break;
                    } 

                } else if(site.equals("W")) {
                        
                        int mapW = startC - num;
                    
                    if(mapW < 0 || park[startR].charAt(startC - j) == 'X') {
                        isok = false;
                        break;
                    } 
                } else if(site.equals("N")) {
                    int mapN = startR - num;
                    
                    if(mapN < 0 || park[startR - j].charAt(startC) == 'X') {
                        isok = false;
                        break;
                    } 
                    
                } else {
                    int mapS = startR + num;
                    
                    if(mapS >= park.length || park[startR + j].charAt(startC) == 'X') {
                        isok = false;
                        break;
                    } 
                }
                
                }
            
            if(isok) {
                
                if(site.equals("E")) {
                    startC = startC + num;
                } else if(site.equals("W")) {
                    startC = startC - num;
                } else if(site.equals("N")) {
                    startR = startR - num;
                } else {
                    startR = startR + num;
                }
            }
                
            }
        
        int[] answer = {startR, startC};
        
        
            return answer;
        }
    }