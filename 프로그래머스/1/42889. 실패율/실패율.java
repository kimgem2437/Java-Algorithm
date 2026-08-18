import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        
        int[] result = new int[N];
        double[] fail = new double[N + 2];
        int[] num = new int[N + 2];
        Integer[] stageNum = new Integer[N];
        
        for(int i = 0; i < stages.length; i++){
            num[stages[i]]++;
        }
        
        int total = stages.length;
        
        for(int i = 1; i < fail.length; i++) {
            if (total == 0) {
                fail[i] = 0;
            } else {
                fail[i] = (double) num[i] / total;
            }
            
            total -= num[i];
        }
        
        for (int i = 0; i < N; i++) {
            stageNum[i] = i + 1;
        }
        
        Arrays.sort(stageNum, (a, b) -> {
            if(fail[a] == fail[b]) {
                return a - b;
            }
            return Double.compare(fail[b], fail[a]);
        });
        
        for (int i = 0; i < N; i++) {
            result[i] = stageNum[i];
        }
        
        return result;
    }
}