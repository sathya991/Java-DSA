class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> ar = new ArrayList();
        
        int cur =0;
        int j = num.length - 1;
        while(k>0||j>=0){
            if(j>=0){
            cur = num[j]+k;
            k = cur/10;
            }
            else{
            cur = k;
            k = k/10;
            }
            cur %= 10;
            ar.add(cur);
            j--;
        }
        Collections.reverse(ar);
        return ar;
    }
}