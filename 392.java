class Solution {
    public boolean isSubsequence(String s, String t) {
    if(s.length() > t.length()){
      return false;
    }
    int k = 0;
    int i = 0;
    if(s.length() == 0){
        return true;
    }
     while(k < t.length()){
      if(t.charAt(k) == s.charAt(i)){
        i++;
      }
      k++;
        if(i > s.length()-1){
          return true;
        }
    }
    return false;
    }
}