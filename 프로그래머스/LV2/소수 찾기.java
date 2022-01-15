import java.util.HashSet;
class Solution {
    public int solution(String numbers) {
        int answer = 0;
        HashSet<Integer> set = new HashSet<>();
        permutation("", numbers, set);
        while(set.iterator().hasNext()) {
            int a = set.iterator().next();
            if(isPrime(a)) answer++;
            set.remove(a);
        }
        return answer;
    }
    
    private boolean isPrime(int num) {
        if(num==2) return true;
        else if(num==0 || num==1 || num%2==0) return false;
        for(int i = 3; i <= (int)Math.sqrt(num); i+=2) {
            if(num%i==0) return false;
        }
        return true;
    }
    
    private void permutation(String prefix, String str, HashSet<Integer> set) {
        int n = str.length();
        if(!prefix.equals("")) set.add(Integer.valueOf(prefix));
        for(int i=0; i<n; i++) {
            permutation(prefix + str.charAt(i), str.substring(0,i) + str.substring(i+1, n), set);
        }
    }
}
