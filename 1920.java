class Solution {
    public int[] buildArray(int[] nums) {
        int[] newArr = new int[nums.length];
        for(int i = 0;i < nums.length;i++){
            newArr[i] = nums[nums[i]];
        }
        return newArr;
    }
}