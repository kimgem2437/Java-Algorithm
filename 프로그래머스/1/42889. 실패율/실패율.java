import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        
        double[] fail = new double[N + 2];
        int[] cnt = new int[N + 2];
        
        for(int i = 0; i < stages.length; i++){
            cnt[stages[i]]++;
        }
        
        int total = stages.length;
        
        for(int i = 1; i <= N; i++){
            
            if(total == 0){
                fail[i] = 0;
            } else {
                fail[i] = (double) cnt[i] / total;
            }
            total -= cnt[i];
        }
        
        Integer[] stageNum = new Integer[N];
        
        for(int i = 0; i < N; i++){
            stageNum[i] = i + 1;
        }
        
        Arrays.sort(stageNum, (a, b) -> {
            if(fail[a] == fail[b]){
                return a - b;
            }
            return Double.compare(fail[b], fail[a]);
        });
        
        int[] result = new int[N];
        
        for(int i = 0; i < N; i++){
            result[i] = stageNum[i];
        }
        
        return result;
    }
}