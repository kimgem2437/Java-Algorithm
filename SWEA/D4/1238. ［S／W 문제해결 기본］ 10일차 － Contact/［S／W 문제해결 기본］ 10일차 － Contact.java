import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;
import java.io.IOException;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        for (int T = 1; T <= 10; T++) {
        	sb.append("#").append(T).append(" ");
        	
            StringTokenizer st = new StringTokenizer(br.readLine());
            int len = Integer.parseInt(st.nextToken());
            int start = Integer.parseInt(st.nextToken());


            List<Integer>[] graph = new ArrayList[101];
            for (int i = 0; i <= 100; i++) {
                graph[i] = new ArrayList<>();
            }

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < len / 2; i++) {
                int from = Integer.parseInt(st.nextToken());
                int to = Integer.parseInt(st.nextToken());
                graph[from].add(to);
            }

            int result = bfs(graph, start);
            sb.append(result).append("\n");
            
        }//Test case
        System.out.println(sb);
    }//main

    public static int bfs(List<Integer>[] graph, int start) {
        Queue<Integer> q = new LinkedList<>();
        int[] network  = new int[101];
        Arrays.fill(network , -1);

        q.offer(start);
        network [start] = 0;

        int max = 0;

        while (!q.isEmpty()) {
            int curr = q.poll();
            max = Math.max(max, network [curr]);

            for (int i = 0; i < graph[curr].size(); i++) {
                int neighbor = graph[curr].get(i);
                if (network[neighbor] == -1) {
                	network[neighbor] = network[curr] + 1;
                    q.offer(neighbor);
                }
            }
        }

        int maxcontact = 0;
        for (int i = 1; i <= 100; i++) {
            if (network[i] == max) {
                maxcontact = Math.max(maxcontact, i);
            }
        }

        return maxcontact;
    }//bfs
}