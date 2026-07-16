class Solution {
    public String solution(int a, int b) {
        
        String[] day = {"FRI","SAT","SUN","MON","TUE","WED","THU"};
        
        int sum = 0;
        
        for(int i = 1; i < a; i++){
            
            if(i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12){
                
                sum += 31;
                
            } else if(i == 2) {
                
                sum += 29;
                
            } else {
                sum += 30;
            }
        }
        
        sum += b - 1;
        
        sum %= 7;
        
        String result = day[sum];
        
        
        return result;
    }
}