import java.util.*;

class Solution {
    List<String> words;
    
    public int solution(String begin, String target, String[] words) {
        this.words = Arrays.asList(words);
        return bfs(begin, target);
    }
    
    public int bfs(String begin, String target) {
        boolean[] visit = new boolean[words.size()];
        Queue<String> q = new LinkedList<>();
        q.add(begin);
        
        int answer = 0;
        while(!q.isEmpty()) {
            answer ++;
            int qsize = q.size();
            for(int i=0; i<qsize; i++) {
                String start = q.poll();
                for(String w:words) {
                    if(translateCheck(start, w) && !visit[words.indexOf(w)]){
                        if(w.equals(target)) return answer;
                        q.add(w);
                        visit[words.indexOf(w)] = true;
                    }
                }
            }
        }
        return 0;
    }
    
    public boolean translateCheck(String begin, String target) {
        int diff = 0;
        for(int i=0; i<begin.length(); i++) {
            if(begin.charAt(i) != target.charAt(i)) diff++;
        }
        return diff == 1;
    }
}
