class Solution {
    public int findMin(int[] nums) {
        int s = 0;
        int e = nums.length-1;
        if(nums[s] < nums[e]){
            return nums[s];
        }
        while(s < e){
            int mid = s+(e-s)/2;
            if(s == mid){
                break;
            }
            if(nums[s] > nums[mid]){
                e = mid;
            }
            else{
                s = mid;
            }
        }
        return nums[e];
    }
}