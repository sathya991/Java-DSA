class Solution {
    public boolean isIsomorphic(String s, String t) {
        int[] a = new int[256];
        int[] b = new int[256];
        Arrays.fill(a,-1);
        Arrays.fill(b,-1);
        for(int i = 0;i < s.length();i++){
            char curA = s.charAt(i);
            char curB = t.charAt(i);

            if(a[curA] == -1 && b[curB] == -1){
                a[curA] = curB;
                b[curB] = curA;
            }
            else if(a[curA] != curB && b[curB] != curA){
                return false;
            }
        }
        return true;
    }
}