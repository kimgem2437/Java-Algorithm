class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        
        char[][] sq = {
            {'R', 'T'}, {'C', 'F'}, {'J', 'M'}, {'A', 'N'}
        };
        int[][] score = new int[4][2];
        
        for(int i = 0; i < choices.length; i++){
            if(choices[i] == 4) {
                continue;
            } else if(choices[i] > 4){
                char[] c = survey[i].toCharArray();
                switch(c[1]) {
                    case 'R' :
                        score[0][0] += choices[i] - 4;
                        break;
                        
                    case 'T' :
                        score[0][1] += choices[i] - 4;
                        break;
                    
                    case 'C' :
                        score[1][0] += choices[i] - 4;
                        break;
                        
                    case 'F' :
                        score[1][1] += choices[i] - 4;
                        break;
                        
                    case 'J' :
                        score[2][0] += choices[i] - 4;
                        break;
                        
                    case 'M' :
                        score[2][1] += choices[i] - 4;
                        break;
                        
                    case 'A' :
                        score[3][0] += choices[i] - 4;
                        break;
                        
                    case 'N' :
                        score[3][1] += choices[i] - 4;
                        break;
                        
                }
                
            } else {
                
                char[] c = survey[i].toCharArray();
                
                switch(c[0]) {
                    case 'R' :
                        score[0][0] += 4 - choices[i];
                        break;
                        
                    case 'T' :
                        score[0][1] += 4 - choices[i];
                        break;
                    
                    case 'C' :
                        score[1][0] += 4 - choices[i];
                        break;
                        
                    case 'F' :
                        score[1][1] += 4 - choices[i];
                        break;
                        
                    case 'J' :
                        score[2][0] += 4 - choices[i];
                        break;
                        
                    case 'M' :
                        score[2][1] += 4 - choices[i];
                        break;
                        
                    case 'A' :
                        score[3][0] += 4 - choices[i];
                        break;
                        
                    case 'N' :
                        score[3][1] +=  4 - choices[i];
                        break;
                        
                }
            }
        }
        
        for(int i = 0; i < 4; i++){
            
            if(score[i][0] >= score[i][1]) {
                answer += sq[i][0];
            } else {
                answer += sq[i][1];
            }
            
        }
        
        
        return answer;
    }
}