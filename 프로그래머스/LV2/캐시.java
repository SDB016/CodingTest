import java.util.*;
class Solution {
    public int solution(int cacheSize, String[] cities) {
        if(cacheSize == 0) return cities.length*5;
        int answer = 0;
        Queue<String> q = new LinkedList<>();
        for(String c:cities){
            c = c.toUpperCase();
            if(q.size()+1 <= cacheSize) {
                if(q.contains(c)) answer+=popNpush(q, c);
                else {
                    q.add(c);
                    answer += 5;
                }
            } else {
                if(q.contains(c)) answer+=popNpush(q, c);
                else {
                    q.poll();
                    q.add(c);
                    answer += 5;
                }
            }
        }
        return answer;
    }
    
    public int popNpush(Queue<String> q, String c){
        q.remove(c);
        q.add(c);
        return 1;
    } 
}
