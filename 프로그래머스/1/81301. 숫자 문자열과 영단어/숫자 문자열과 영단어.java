class Solution {
    public int solution(String s) {
        
        String[] st = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        
        s = s.replace("zero", st[0]);
        s = s.replace("one", st[1]);
        s = s.replace("two", st[2]);
        s = s.replace("three", st[3]);
        s = s.replace("four", st[4]);
        s = s.replace("five", st[5]);
        s = s.replace("six", st[6]);
        s = s.replace("seven", st[7]);
        s = s.replace("eight", st[8]);
        s = s.replace("nine", st[9]);
        
        int result = Integer.parseInt(s);
        
        return result;
    }
}