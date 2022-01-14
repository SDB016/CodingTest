import java.util.*;
class Solution {
    public int solution(int[] numbers, int target) {
        int answer = bfs(numbers, target);
        //int answer = dfs(numbers, 0, 0, target);
        return answer;
    }
    
    private int dfs(int[] numbers, int num, int level, int target) {
        if(level==numbers.length) {
            return (num==target) ? 1 : 0;
        }
        return dfs(numbers, num+numbers[level], level+1, target) + dfs(numbers, num-numbers[level], level+1, target);
    }
    
    private int bfs(int[] numbers, int target) {
        int answer = 0;
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{0, 0});
        while(q.size() > 0) {
            int[] element = q.poll();
            int num = element[0];
            int level = element[1];
            if(level == numbers.length) {
                if (num == target) answer++;
            }
            else {
                q.add(new int[]{num + numbers[level], level+1});
                q.add(new int[]{num - numbers[level], level+1});
            }
        }
        return answer;
    }
}
