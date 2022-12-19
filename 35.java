class Solution {
    public int searchInsert(int[] nums, int target) {
        if(target > nums[nums.length-1]){
            return nums.length;
        }
        int s = 0;
        int e = nums.length-1;
        while(s < e){
            int mid = s+(e-s)/2;
            if(target == nums[mid]){
                return mid;
            }
            else if(target < nums[mid]){
                e = mid-1;
            }
            else{
                s = mid+1;
            }
        }
        if(target <= nums[s]){
            return s;
        }
        else{
            return s+1;
        }
    }
}