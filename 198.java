class Solution {
    public int rob(int[] nums) {
        if(nums.length == 1) return nums[0];
        int dp1 = nums[0];
        int dp2 = Math.max(nums[0],nums[1]);
        for(int i = 2;i < nums.length;i++){
            int temp = Math.max(dp2, dp1 + nums[i]);
            dp1 = dp2;
            dp2 = temp;
        }
        return dp2;
    }
}