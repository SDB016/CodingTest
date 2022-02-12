class Solution {
    public String solution(String s) {
        String answer = "";
        String[] arr = s.toLowerCase().split("");
        boolean flag = true;
        
        for(String c:arr) {
            answer += flag ? c.toUpperCase() : c;
            flag = c.equals(" ") ? true : false;
        }
        return answer;
    }
}
