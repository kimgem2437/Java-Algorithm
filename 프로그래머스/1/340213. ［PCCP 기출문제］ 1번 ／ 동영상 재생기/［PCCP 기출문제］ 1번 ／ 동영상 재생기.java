class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        
        String[] video_time = video_len.split(":");
        int video_second = Integer.parseInt(video_time[0]) * 60 + Integer.parseInt(video_time[1]);
        
        String[] pos_time = pos.split(":");
        int pos_second = Integer.parseInt(pos_time[0]) * 60 + Integer.parseInt(pos_time[1]);
        
        String[] op_strat_time = op_start.split(":");
        int op_start_second = Integer.parseInt(op_strat_time[0]) * 60 + Integer.parseInt(op_strat_time[1]);
        
        String[] op_end_time = op_end.split(":");
        int op_end_second = Integer.parseInt(op_end_time[0]) * 60 + Integer.parseInt(op_end_time[1]);
        
        for(int i = 0; i < commands.length; i++) {
            
            if(commands[i].equals("next")) {
                
                if(pos_second >= op_start_second && pos_second < op_end_second) {
                    pos_second = op_end_second;
                    pos_second += 10;
                    continue;
                }
                
                pos_second += 10;
                 if(pos_second >= op_start_second && pos_second < op_end_second) {
                    pos_second = op_end_second;
                 }
                
                pos_second = Math.min(pos_second, video_second);
                
            } else {
                
                if(pos_second >= op_start_second && pos_second < op_end_second) {
                    pos_second = op_end_second;
                    pos_second -= 10;
                    continue;
                }
                
                pos_second -= 10;
                if(pos_second >= op_start_second && pos_second < op_end_second) {
                    pos_second = op_end_second;
                }
                pos_second = Math.max(pos_second, 0);
                
            }
            
        }
        
        int minute = pos_second / 60;
        int second = pos_second % 60;
        
        String minute_st;
        String second_st;
        
        if(minute < 10) {
            minute_st = "0" + minute;
        } else {
            minute_st = String.valueOf(minute);
        }
        if(second < 10) {
            second_st = "0" + second;
        } else {
            second_st = String.valueOf(second);
        }
        
        String answer = minute_st + ":" + second_st;
        
        
        return answer;
    }
}