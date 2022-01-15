import java.util.*;
class Solution {
    public String solution(String number, int k) {
        Stack<String> stack = new Stack<>();
        int resCount = number.length() - k;
        for(String s : number.split("")) {
            while(!stack.empty() && Integer.parseInt(stack.peek()) < Integer.parseInt(s) && k-- > 0) {
                stack.pop();
            }
            stack.push(s);
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<resCount; i++) {
             sb.append(stack.get(i));
        }
        return sb.toString();
    }
}
