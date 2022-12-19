class Solution {
    public boolean search(int[] nums, int target) {
       int s = 0;
        int e = nums.length-1;
        if(nums.length == 1){
            if(nums[s] == target){
                return true;
            }
            return false;
        }
        while(s+1 < e){
            int mid = s+(e-s)/2;
            if(nums[mid] == nums[s]){
                s++;
            }
            else if(nums[mid] == nums[e]){
                e--;
            }
            else if(nums[mid] > nums[s]){
                if(nums[mid] >= target && target >= nums[s]){
                    e = mid;
                }else{
                    s = mid;
                }
            }
            else{
                if(target <= nums[e] && nums[mid] <= target){
                    s = mid;
                }else{
                    e = mid;
                }
               
            }
        }
             if(nums[s] == target){
                return true;
            }else if(nums[e] == target){
                return true;
            }
        return false;
    }
}