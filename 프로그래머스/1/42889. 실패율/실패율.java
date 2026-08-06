import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        
        int[] count = new int[N + 2];
        
        for(int stage : stages){
            count[stage]++;
        }
        
        double[] fail = new double[N + 1];
        
        int players = stages.length;
        
        for(int i = 1; i <= N; i++){
            
            if(players == 0) {
                fail[i] = 0;
            } else {
                fail[i] = (double) count[i] / players;
            }
            
            players -= count[i];
        }
        
        Integer[] stageNums = new Integer[N];
        
        for(int i = 0; i < N; i++){
            stageNums[i] = i + 1;
        }
        
        Arrays.sort(stageNums, (a, b) -> {
            if(fail[a] == fail[b]){
                return a - b;
            }
            
            return Double.compare(fail[b], fail[a]);
        });
        
        int[] result = new int[N];
        
        for(int i = 0; i < N; i++){
            result[i] = stageNums[i];
        }        
        
        return result;
    }
}