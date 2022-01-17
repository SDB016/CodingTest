import java.util.*;
import java.util.stream.Collectors;
class Solution {
    private List<List<Integer>> list = new ArrayList<>();
    
    public int solution(int n, int[][] wires) {
        int answer = Integer.MAX_VALUE;
        
        for(int i=0; i<n+1; i++) {
            list.add(new ArrayList<>());
        }
        
        for(int[] wire:wires) {
            list.get(wire[0]).add(wire[1]);
            list.get(wire[1]).add(wire[0]);
        }
        
        for(int e=0; e<wires.length; e++){
            boolean[] check = new boolean[n+1];
            for(int i=1; i<n+1; i++) {
                if(!check[i]) {
                    int k = bfs(wires[e][0], wires[e][1], i, check);
                    answer = Math.min(answer, Math.abs(2*k-n));
                }
            }
        }
        return answer;
    }
    
    public int bfs(int v1, int v2, int start, boolean[] check) {
        int cnt = 1;
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        check[start] = true;
        
        while(!q.isEmpty()) {
            int v = q.poll();
            for(int conn:list.get(v)) {
                if((v == v1 && conn == v2) || (v == v2 && conn==v1)) continue;
                if(!check[conn]) {
                    cnt++;
                    check[conn] = true;
                    q.add(conn);
                }
            }
        }
        return cnt;
    }
}

