class Solution {
    public int search(int[] nums, int target) {
     int s = 0;
        int e = nums.length-1;
        while(s<e){
            int mid = s+(e-s)/2;
            if(nums[mid] == target){
                return mid;
            }
            if(nums[s] <= nums[mid]){
                if(target< nums[mid] && nums[s] < nums[e]){
                    e = mid-1;
                }
                else if(target< nums[mid] && target > nums[e]){
                    e = mid-1;
                }else{
                    s = mid+1;
                }
            }
            else if(nums[e] >= nums[mid]){
                if(target > nums[mid] && target <= nums[e]){
                    s = mid+1;
                }else{
                    e = mid-1;
                }
            }
        }
        if(s >= 0 && s <= nums.length-1 && nums[s] == target ){
            return s;
        }
        else if(e >= 0 && e <= nums.length-1 && nums[e] == target ){
            return e;
        }
        return -1;
    }

}