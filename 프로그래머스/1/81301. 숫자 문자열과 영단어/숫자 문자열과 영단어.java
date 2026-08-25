class Solution {
    public int solution(String s) {
        
        String[] eng = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < s.length(); i++){
            
            char c = s.charAt(i);
            
            if(c >= '0' && c <= '9'){
                sb.append(c);
            } else if(c == 'z'){
                sb.append("0");
                i += 3;
            } else if(c == 'o'){
                sb.append("1");
                i += 2;
            } else if(c == 'e'){
                sb.append("8");
                i += 4;
            } else if(c == 'n'){
                sb.append("9");
                i += 3;
            } else if(i + 1 < s.length() && c == 't' && s.charAt(i + 1) == 'w'){
                sb.append("2");
                i += 2;
            } else if(i + 1 < s.length() && c == 't' && s.charAt(i + 1) == 'h'){
                sb.append("3");
                i += 4;
            } else if(i + 1 < s.length() && c == 'f' && s.charAt(i + 1) == 'o'){
                sb.append("4");
                i += 3;
            } else if(i + 1 < s.length() && c == 'f' && s.charAt(i + 1) == 'i'){
                sb.append("5");
                i += 3;
            } else if(i + 1 < s.length() && c == 's' && s.charAt(i + 1) == 'i'){
                sb.append("6");
                i += 2;
            } else if(i + 1 < s.length() && c == 's' && s.charAt(i + 1) == 'e') {
                sb.append("7");
                i += 4;
            }
        }
        
        int result = Integer.parseInt(sb.toString());
        
        return result;
    }
}