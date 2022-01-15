import java.util.LinkedList;
import java.util.Queue;
class Solution {
    public int solution(int[][] maps) {
        int answer = bfs(maps, new int[]{0,0});
        return answer;
    }
    
    private int bfs(int[][] maps, int[] start) {
        boolean[][] check = new boolean[maps.length][maps[0].length];
        Queue<int[]> q = new LinkedList<>();
        int[] dy = {1,0,-1,0}, dx = {0,1,0,-1};
        q.add(start);
        while(!q.isEmpty()) {
            int[] p = q.poll();
            int y = p[0], x = p[1];
            check[y][x] = true;
            if(y == maps.length-1 && x == maps[0].length-1) return maps[y][x];
            for(int i = 0; i<4; i++) {
                int ny = y+dy[i], nx = x+dx[i];
                if(0<=ny && ny<maps.length && 0<=nx && nx<maps[0].length) {
                    if(maps[ny][nx] == 1 && !check[ny][nx]) {
                        q.add(new int[]{ny, nx});
                        maps[ny][nx] = maps[y][x] + 1;
                    }
                }
            }
        }
        return -1;
    }
}
