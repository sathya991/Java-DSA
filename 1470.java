class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] returnAr = new int[2*n];
       int i = 0;
        int j = 0;
        while(i < n){
            returnAr[j] = nums[i];
            returnAr[j+1] = nums[i+n];
            j+=2;
            i++;
        }
        return returnAr;
    }
}