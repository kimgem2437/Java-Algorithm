import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int groupWordCount = 0;

        for (int i = 0; i < N; i++) {
            String word = br.readLine();
            if (isGroupWord(word)) {
                groupWordCount++;
            }
        }

        System.out.println(groupWordCount);
    }

    static boolean isGroupWord(String word) {
        boolean[] isVisited = new boolean[26];
        char prevChar = ' ';

        for (int i = 0; i < word.length(); i++) {
            char currentChar = word.charAt(i);
            
            // 이전 문자와 다를 경우
            if (currentChar != prevChar) {
                // 현재 문자가 이미 이전에 등장한 적이 있는지 확인
                if (isVisited[currentChar - 'a']) {
                    return false; // 그룹 단어가 아님
                }
                isVisited[currentChar - 'a'] = true;
                prevChar = currentChar;
            }
        }
        return true; // 그룹 단어임
    }
}