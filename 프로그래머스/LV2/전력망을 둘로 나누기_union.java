class Solution {
    static int[] parents;
    
    public int solution(int n, int[][] wires) {
        int answer = Integer.MAX_VALUE;
        parents = new int[n+1];
        int idx = 0;
        
        while(idx < wires.length) {
            for(int i= 1; i<n+1; i++) {
                parents[i] = i;
            }         
            
            for(int i=0; i<wires.length; i++) {
                if(idx == i) continue;
                union(wires[i][0], wires[i][1]);
            }
            
            int temp = 0;
            for(int i=1; i<n+1; i++) {
                if(find(i) == 1) temp++;
            }
            answer = Math.min(answer, Math.abs(2*temp-n));
            idx++;
        }
        return answer;
    }
    
    static int find(int a) {
        if(parents[a] == a) return a;
        return find(parents[a]);
    }
    
    static void union(int a, int b) {
        int pa = find(a);
        int pb = find(b);
        
        if(pa != pb) {
            if(pa > pb) {
                int temp = pa;
                pa = pb;
                pb = temp;
            }
            parents[pb] = pa;
        }
    }
}
