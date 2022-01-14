import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] dayOfend = new int[100];
        int day = -1;
        for(int i=0; i<progresses.length; i++) {
            while(progresses[i] + (day*speeds[i]) < 100) {
                day++;
            }
            dayOfend[day]++;
        }
        for (int i=0; i<dayOfend.length; i++) {
            System.out.println(dayOfend[i]);
        }
        return Arrays.stream(dayOfend).filter(i -> i!=0).toArray();
    }
}

