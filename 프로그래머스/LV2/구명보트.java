import java.util.*;
class Solution {
    public int solution(int[] people, int limit) {
        Arrays.sort(people);
        int i = 0, j = people.length-1;
        for(; i < j; j--){
            if(people[j] <= limit/2) {
                i += (j-i+1) / 2;
                break;
            }
            if(people[i]+people[j] <= limit) i++;
        }
        return people.length - i;
    }
}
