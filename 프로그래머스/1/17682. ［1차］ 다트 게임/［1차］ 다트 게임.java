class Solution {
    public int solution(String dartResult) {
        int result = 0;
        int[] num = new int[3];
        int index = 0;
                
        for(int i = 0; i < dartResult.length(); i++){
            
            char c = dartResult.charAt(i);
            
            if(c >= '0' && c <= '9'){
                if(i + 1 < dartResult.length() && dartResult.charAt(i + 1) == '0' && c == '1'){
                    num[index] = 10;
                    i += 1;
                    continue;
                }
                num[index] = c - '0';
                continue;
            }
            
            if(c == 'S' || c == 'D' || c == 'T'){
                switch (c) {
                    case 'S' :
                        break;
                    case 'D' :
                        num[index] *= num[index];
                        break;
                    case 'T':
                        num[index] *= (num[index] * num[index]);
                        break;
                }
                if(i + 1 < dartResult.length() &&
                  (dartResult.charAt(i + 1) == '#' || dartResult.charAt(i + 1) == '*')){
                    continue;
                } else if(index + 1 < 3){
                    index++;
                    continue;
                }
            }
            
            if(c == '#' || c == '*'){
                switch (c) {
                    case '*' :
                        if(index - 1 >= 0) {
                            num[index - 1] *= 2;
                            num[index] *= 2;
                        } else {
                            num[index] *= 2;
                        }
                        if(index + 1 < 3){
                            index++;
                        }
                        break;
                    case '#':
                        num[index] = -(num[index]);
                        if(index + 1 < 3){
                            index++;
                        }
                        break;
                }
            }
            
        }
        
        for(int i = 0; i < 3; i++){
                result += num[i];
        }
        
        return result;
    }
}