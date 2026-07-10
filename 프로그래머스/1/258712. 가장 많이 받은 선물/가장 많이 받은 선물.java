import java.util.*;

class Solution {
    public int solution(String[] friends, String[] gifts) {
        
        HashMap<String, Integer> map = new HashMap<>();
        
        for(int i = 0; i < friends.length; i++){
            
            map.put(friends[i], i);
        }
        
        int[][] gift = new int[friends.length][friends.length];
        int[] score = new int[friends.length];
        
        for(int i = 0; i < gifts.length; i++) {
            
            String[] info = gifts[i].split(" ");
            
            String fromName = info[0];
            String toName = info[1];
            
            int from = map.get(fromName);
            int to = map.get(toName);
            
            gift[from][to]++;
            score[from]++;
            score[to]--;
            
        }
        
        int[] result = new int[friends.length];
        
        for(int i = 0; i < friends.length; i++) {
            
        for(int j = i+1; j < friends.length; j++) {
            
            if(gift[i][j] > gift[j][i]) {
                result[i]++;
            } else if(gift[i][j] < gift[j][i]) {
                result[j]++;
            } else {
                if(score[i] > score[j]) {
                result[i]++;
            } else if(score[i] < score[j]) {
                result[j]++;
            }
                
            }
        }
        }
        
        int answer = 0;
        
        for(int i = 0; i < result.length; i++) {
            answer = Math.max(answer, result[i]);
        }
        
        
        return answer;
    }
}