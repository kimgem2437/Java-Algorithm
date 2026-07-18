import java.util.*;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        
        ArrayList<int[]> list = new ArrayList<>();
        
        int extIdx = 0;
        int sortIdx = 0;
        switch(ext){
            case "code" :
                extIdx = 0;
                break;
            case "date" :
                extIdx = 1;
                break;
            case "maximum" :
                extIdx = 2;
                break;
            case "remain" :
                extIdx = 3;
        }
        switch(sort_by){
            case "code" :
                sortIdx = 0;
                break;
            case "date" :
                sortIdx = 1;
                break;
            case "maximum" :
                sortIdx = 2;
                break;
            case "remain" :
                sortIdx = 3;
        }
        
        for(int i = 0; i < data.length; i++){
    
            if(data[i][extIdx] < val_ext) {
                    list.add(data[i]);
            }
            
        }
        
        final int sIdx = sortIdx;
        
        Collections.sort(list, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return a[sIdx] - b[sIdx]; 
            }
        });
        
        int[][] result = new int[list.size()][4];
        
        for(int i = 0; i < result.length; i++){
                result[i]= list.get(i);
        }
        
        return result;
    }
}