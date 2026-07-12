import java.util.*;

class Solution {
    public int solution(String message, int[][] spoiler_ranges) {
        
        ArrayList<String> words = new ArrayList<>();
        ArrayList<int[]> wordRanges = new ArrayList<>();
        
        int idx = 0;
        
        while(idx < message.length()) {
            
            int start = idx;
            
            while(idx < message.length() && message.charAt(idx) != ' ') {
                idx++;
            }
            
            int end = idx - 1;
            
            words.add(message.substring(start, end + 1));
            wordRanges.add(new int[]{start, end});
            
            idx++;
        }
        
        HashSet<String> normalWords = new HashSet<>();
        ArrayList<ArrayList<Integer>> revealAt = new ArrayList<>();
        
        for(int i = 0 ; i < spoiler_ranges.length; i++){
            revealAt.add(new ArrayList<>());
        }
                
        for(int i = 0; i < words.size(); i++) {
            
            int[] range = wordRanges.get(i);
            int wordStart = range[0];
            int wordEnd = range[1];
            
            int lastSpoilerRange = -1;
            
            for(int j = 0; j < spoiler_ranges.length; j++) {
                
                int spoilerStart = spoiler_ranges[j][0];
                int spoilerEnd = spoiler_ranges[j][1];
                
                if(wordEnd >= spoilerStart && wordStart <= spoilerEnd) {
                    lastSpoilerRange = j;
                }
            }
            
            if(lastSpoilerRange == -1){
                normalWords.add(words.get(i));
            } else {
                revealAt.get(lastSpoilerRange).add(i);
            }
        }
        
        int result = 0;
        HashSet<String> revealed = new HashSet<>();
        
        for(int i = 0; i < spoiler_ranges.length; i++) {
            
            for(int wordIndex : revealAt.get(i)) {
                
                String word = words.get(wordIndex);
                
                if(!normalWords.contains(word) && !revealed.contains(word)) {
                    result++;
                }
                
                revealed.add(word);
            }
        }
        
        return result;
    }
}