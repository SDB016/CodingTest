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
        for(int[] wire:wires) {
            int ret = dfs(wire[0], wire[1], wire[0], new boolean[n+1]);
            answer = Math.min(answer, Math.abs(n-2*ret));
        }
        
        return answer;
    }
    
    public int dfs(int v1, int v2, int start, boolean[] check) {
        if(check[start]) return 0;
        check[start] = true;
        int cnt = 1;
        for(int n : list.get(start)) {
            if((n==v1 && start==v2) || (n==v2 && start == v1)) continue;
            cnt += dfs(v1, v2, n, check);
        }
        return cnt;
    }
    
}

