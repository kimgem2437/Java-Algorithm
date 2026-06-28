class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        
        int[][] pad = {
            {3, 1},
            {0, 0},
            {0, 1},
            {0, 2},
            {1, 0},
            {1, 1},
            {1, 2},
            {2, 0},
            {2, 1},
            {2, 2}
        };
        
        int[] left = {3,0};
        int[] right = {3, 2};
        
        for(int i = 0; i < numbers.length; i++){
            
            int num = numbers[i];
            
            if(num == 1 || num == 4 || num == 7) {
                answer += "L";
                left = pad[num];
            } else if(num == 3 || num == 6 || num == 9){
                answer += "R";
                right = pad[num];
            } else {
                int leftDist = Math.abs(left[0] - pad[num][0]) + Math.abs(left[1] - pad[num][1]);
                
                int rightDist = Math.abs(right[0] - pad[num][0]) + Math.abs(right[1] - pad[num][1]);
                
                if(leftDist < rightDist) {
                    answer += "L";
                    left = pad[num];
                } else if(rightDist < leftDist) {
                    answer += "R";
                    right = pad[num];
                } else {
                    if(hand.equals("left")) {
                        answer += "L";
                        left = pad[num];
                    } else {
                        answer += "R";
                        right = pad[num];
                    }
                }
            }
        }
        
        return answer;
    }
}