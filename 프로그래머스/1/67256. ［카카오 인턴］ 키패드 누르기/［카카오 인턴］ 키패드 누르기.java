class Solution {
    
    String keypad = "123456789*0#";
    
    public String solution(int[] numbers, String hand) {
        
        char left = '*';
        char right = '#';
        
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < numbers.length; i++) {
            
            int number = numbers[i];
            char target = (char)(number + '0');
            
            if (number == 1 || number == 4 || number == 7) {
                sb.append("L");
                left = target;
                
            } else if (number == 3 || number == 6 || number == 9) {
                sb.append("R");
                right = target;
                
            } else {
                int leftDist = getDistance(left, target);
                int rightDist = getDistance(right, target);
                
                if (leftDist < rightDist) {
                    sb.append("L");
                    left = target;
                    
                } else if (rightDist < leftDist) {
                    sb.append("R");
                    right = target;
                    
                } else {
                    if (hand.equals("left")) {
                        sb.append("L");
                        left = target;
                    } else {
                        sb.append("R");
                        right = target;
                    }
                }
            }
        }
        
        return sb.toString();
    }
    
    public int getDistance(char from, char to) {
        
        int fromIndex = keypad.indexOf(from);
        int toIndex = keypad.indexOf(to);
        
        int fromR = fromIndex / 3;
        int fromC = fromIndex % 3;
        
        int toR = toIndex / 3;
        int toC = toIndex % 3;
        
        return Math.abs(fromR - toR) + Math.abs(fromC - toC);
    }
}