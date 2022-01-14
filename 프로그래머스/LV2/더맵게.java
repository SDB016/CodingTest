import java.util.*;
class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> q = new PriorityQueue<>();
        for (int s:scoville) {
            q.add(s);
        }
        while(q.size() > 1){
            int min_1 = q.poll();
            if(min_1 >= K) break;
            else {
                q.add(min_1 + q.poll()*2);
                answer++;
            }
        }
        if(q.poll() < K) return -1;
        return answer;
    }
}
