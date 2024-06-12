class Solution {
    public int pivotIndex(int[] nums) {
       int sum = 0;
       int ls = 0;
       for(int x: nums) sum += x;
       for(int i = 0;i < nums.length;i++){
           if(ls == sum-ls-nums[i]) return i;
           ls += nums[i];
       }
       return -1;
    }
}