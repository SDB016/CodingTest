import java.util.*;

class Solution {
    public String solution(String m, String[] musicinfos) {
        String answer = "(None)";
        int time = 0;
        m = replace(m);
        
        for(String musicinfo:musicinfos){
            
            String[] arr = musicinfo.split(",");
            String[] starttime = {arr[0].split(":")[0], arr[0].split(":")[1]};
            String[] endtime = {arr[1].split(":")[0], arr[1].split(":")[1]};
            
            int hour = Integer.parseInt(endtime[0]) - Integer.parseInt(starttime[0]);
            int min = Integer.parseInt(endtime[1]) - Integer.parseInt(starttime[1]) + (hour * 60);

            String st = replace(arr[3]);
            
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i<min; i++) sb.append(st.charAt(i % st.length()));
            
            if(sb.toString().contains(m)) {
                if(time < min) {
                    time = min;
                    answer = arr[2];
                }
            }
        }
        return answer;
    }
    
    private String replace(String s) {
        s = s.replace("C#", "c");
        s = s.replace("G#", "g");
        s = s.replace("D#", "d");
        s = s.replace("F#", "f");
        s = s.replace("A#", "a");
        return s;
    }
}
