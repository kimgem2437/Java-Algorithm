import java.util.*;

class Solution {

    public int solution(String[][] book_time) {

        int[][] times = new int[book_time.length][2];

        for (int i = 0; i < book_time.length; i++) {
            times[i][0] = toMinute(book_time[i][0]);
            times[i][1] = toMinute(book_time[i][1]) + 10;
        }

        // 시작 시간 기준 정렬
        Arrays.sort(times, (a, b) -> a[0] - b[0]);

        // 각 방이 언제 사용 가능해지는지 저장
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int[] time : times) {

            int start = time[0];
            int end = time[1];

            // 가장 빨리 비는 방을 재사용 가능
            if (!pq.isEmpty() && pq.peek() <= start) {
                pq.poll();
            }

            pq.offer(end);
        }

        return pq.size();
    }

    private int toMinute(String time) {

        String[] arr = time.split(":");

        int hour = Integer.parseInt(arr[0]);
        int minute = Integer.parseInt(arr[1]);

        return hour * 60 + minute;
    }
}