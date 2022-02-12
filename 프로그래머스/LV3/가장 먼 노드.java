import java.util.*;

class Solution {
    int n;
    
    public int solution(int n, int[][] edge) {
        this.n = n;
        return bfs(edge);
    }
    
    public int bfs(int[][] edge) {
        boolean[] visit = new boolean[n];
        boolean[][] connect = new boolean[n][n];
        for(int[] node:edge) {
            connect[node[0]-1][node[1]-1] = true;
            connect[node[1]-1][node[0]-1] = true;
        }
        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        visit[0] = true;
        
        int answer = 0;
        while(!q.isEmpty()) {
            int size = q.size();
            for(int i=0; i<size; i++) {
                int p = q.poll();
                for(int j = 0; j < n; j++) {
                    if(connect[p][j] && !visit[j]) {
                        q.add(j);
                        visit[j] = true;
                    }
                }
            }
            answer = size;
        }
        return answer;
    }
}
