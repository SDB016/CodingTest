class Solution {
    public String solution(int n, int t, int m, int p) {
        StringBuilder answer = new StringBuilder();
        int num = 0;
        StringBuilder sb = new StringBuilder();
        while(sb.length() < m*t){sb.append(Integer.toString(num++, n));}
        for(int i=0; i<t; i++) answer.append(sb.toString().charAt(m*i+p-1));
        return answer.toString().toUpperCase();
    }
}
