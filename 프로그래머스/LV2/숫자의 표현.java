class Solution {
    public int solution(int n) {
        if(n<3) return 1;
        int answer = 0;
        int left = 1, right = 2;
        int sum = left + right;
        while(right <= sum) {
            if(sum < n) {
                sum += ++right;
                continue;
            }
            if(sum == n) answer++;
            sum -= left++;
        }
        return answer;
    }
}
