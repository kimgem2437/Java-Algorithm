class Solution {
    
    String phone = "123456789*0#";
    
    public String solution(int[] numbers, String hand) {

        String left = "*";
        String right = "#";
        String result = "";
        
        for(int i = 0; i < numbers.length; i++){
            
            int num = numbers[i];
            String target = String.valueOf(num);
            
            if(numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7){
                result += "L";
                left = target;
                
            } else if(numbers[i] == 3 || numbers[i] == 6 || numbers[i] == 9) {
                result += "R";
                right = target;
            } else {
                
                int leftDis = getDistance(left, target);
                int rightDis = getDistance(right, target);
                
                if (leftDis < rightDis) {
                    result += "L";
                    left = target;
                    
                } else if (rightDis < leftDis) {
                    result += "R";
                    right = target;
                    
                } else {
                    if (hand.equals("left")) {
                        result += "L";
                        left = target;
                    } else {
                        result += "R";
                        right = target;
                    }
                }
            }
        }
        
        return result;
    }
    
    public int getDistance(String from, String to) {
        
        int fromIdx = phone.indexOf(from);
        int toIdx = phone.indexOf(to);
        
        int fromRow = fromIdx / 3;
        int fromCol = fromIdx % 3;
        
        int toRow = toIdx / 3;
        int toCol = toIdx % 3;
        
        return Math.abs(fromRow - toRow) + Math.abs(fromCol - toCol);
    }
}