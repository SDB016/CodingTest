import java.util.HashMap;
import java.util.Collection;
class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        HashMap<String, Integer> map = new HashMap<>();
        for(String[] arr:clothes) {
            if(map.containsKey(arr[1])) map.put(arr[1], map.get(arr[1]) + 1);
            else map.put(arr[1], 2);
        }
        Collection<Integer> values = map.values();
        for(int v:values) {
            answer *= v;
        }
        return answer-1;
    }
}
