class Solution {
    public int[] searchRange(int[] nums, int target) {
       int s = 0;
    int e = nums.length-1;
    int[] ar = {-1,-1};
    ar[0] = bs(s, e, target, nums, true);
    if(ar[0] != -1){
    ar[1] = bs(s, e, target, nums, false);
    }
    return ar;
}
public int bs(int s, int e,int target,int[] nums,boolean elementBefore){
    int ans = -1;
      while(s <= e){
        int mid = s+(e-s)/2;  
        if(nums[mid] > target){
            e = mid-1;
        }
        else if(target > nums[mid]){
            s = mid+1;
        }
        else{
            ans = mid;
            if(elementBefore){
                e = mid-1;
            }
            else{
                s = mid+1;
            }
        }
    }
    return ans;
}
}