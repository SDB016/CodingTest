import java.util.Arrays;
import java.util.Collections;

class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;

        int[] arrA = A;
        Integer[] arrB = Arrays.stream(B).boxed().toArray(Integer[]::new);
        
        Arrays.sort(arrA);
        Arrays.sort(arrB, Collections.reverseOrder());
        
        for(int i=0; i<arrA.length; i++) {
            answer += arrA[i] * arrB[i];
        }

        return answer;
    }
}
