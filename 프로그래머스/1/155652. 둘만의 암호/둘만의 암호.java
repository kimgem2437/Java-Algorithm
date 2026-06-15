public class Solution {
    public String solution(String s, String skip, int index) {
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int count = 0;

            while (count < index) {
                ch++;

                if (ch > 'z') {
                    ch = 'a';
                }

                if (skip.indexOf(ch) >= 0) {
                    continue;
                }

                count++;
            }

            answer.append(ch);
        }

        return answer.toString();
    }
}