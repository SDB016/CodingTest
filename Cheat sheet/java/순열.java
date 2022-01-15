class Permutation{
    private void permutation(String prefix, String str, HashSet<Integer> set) {
        int n = str.length();
        if(!prefix.equals("")) set.add(Integer.valueOf(prefix));
        for(int i=0; i<n; i++) {
            permutation(prefix + str.charAt(i), str.substring(0,i) + str.substring(i+1, n), set);
        }
    }
}
  
