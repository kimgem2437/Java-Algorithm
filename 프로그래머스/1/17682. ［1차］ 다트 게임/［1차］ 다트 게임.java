class Solution {
    public int solution(String dartResult) {
        
        int answer = 0;
        int cnt = 0;
        int index = 0;
        
        int[] chance = new int[3];
        
        for(int i = 0; i < dartResult.length(); i++) {
            
            char c = dartResult.charAt(i);
            
            if('0' <= c && c <='9') {
                if (c == '1' && i + 1 < dartResult.length() && dartResult.charAt(i + 1) == '0') {
                    cnt = 10;
                    i++;
                } else {
                    cnt = c - '0';
                     }
            } else if(c == 'S' || c == 'D' || c == 'T'){
                switch(c) {
                    case 'S':
                        cnt = (int)Math.pow(cnt, 1);
                        break;
                    case 'D' :
                        cnt = (int)Math.pow(cnt, 2);
                        break;
                    case 'T' :
                        cnt = (int)Math.pow(cnt, 3);
                        break;
                }
                chance[index] = cnt;
                index++;
            } else if(c == '#' || c == '*') {
                switch(c) {
                    case '*' :
                        chance[index - 1] *= 2;
                        if (index - 2 >= 0) {
                            chance[index - 2] *= 2;
                        }
                        break;
                    case '#' :
                        chance[index - 1] *= -1;
                        break;
                }
            }
            
            
        }
        
        for(int i = 0; i < 3; i++){
            answer += chance[i];
        }
        
        
        return answer;
    }
}