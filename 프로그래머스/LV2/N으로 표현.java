import java.util.*;

class Solution {
    static int min = Integer.MAX_VALUE;
    int target;
    int N;
    
    public int solution(int N, int number) {
        target = number;
        this.N = N;
        dfs(0, 0);
        if(min == Integer.MAX_VALUE) return -1;
        return min;
    }
    
    public void dfs(int depth, int current) {
        if(depth > 8) return;
        if(target == current) {
            min = Math.min(depth, min);
            return;
        }
        int nn = 0;
        for(int i = 1; i < 9; i++) {
            nn = nn * 10 + N;
            dfs(depth + i, current + nn);
            dfs(depth + i, current - nn);
            dfs(depth + i, current * nn);
            dfs(depth + i, current / nn);
        }    
    }
}
