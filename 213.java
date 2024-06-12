class Solution {
    public int rob(int[] nums) {
        if(nums.length == 1) return nums[0];
        if(nums.length == 2) return Math.max(nums[0],nums[1]);
        int a = findMax(nums,true);
        int b = findMax(nums,false);
        return Math.max(a,b);
    }

    public int findMax(int[] nums,boolean skipStart){
        int skipNum = 0;
        int dp1 = nums[0];
        int dp2 = nums[1];
        int start = 0;
        if(skipStart) {
            start = 3;
             dp1 = nums[1];
             dp2 = Math.max(nums[1],nums[2]);
        }
        else{
            start = 2;
            skipNum = nums.length-1;
             dp1 = nums[0];
             dp2 = Math.max(nums[0],nums[1]);
        }
        for(int i = start;i < nums.length;i++){
            if(i == skipNum) continue;
            int temp = dp1 + nums[i];
            dp1 = dp2;
            dp2 = Math.max(dp2,temp);
        }
        return dp2;
    }
}