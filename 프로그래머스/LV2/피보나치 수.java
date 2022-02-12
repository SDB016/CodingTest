import java.util.List;
import java.util.ArrayList;

class Solution {
    public int solution(int n) {
        List<Integer> dp = new ArrayList<>();
        dp.add(0);
        dp.add(1);
        for(int i = 2; i <= n; i++) {
            dp.add((dp.get(i-2) + dp.get(i-1)) % 1234567);
        }
        return dp.get(n);
    }
}
