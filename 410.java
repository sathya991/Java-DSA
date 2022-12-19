class Solution {
    public int splitArray(int[] nums, int k) {
          int[] ar = findMaxAndSum(nums);
        int s = ar[0];
        int e = ar[1];
        while(s<=e){
            int mid = s+(e-s)/2;
            int count = 1;
            int sum = 0;
            if(s == e){
                return s;
            }
            for(int i = 0;i < nums.length;i++){
                if(sum+nums[i] <= mid){
                    sum+=nums[i];
                }
                else{
                    count++;
                    sum = 0;
                    i--;
                }
            }
            if(count <= k){
                e = mid;
            }
            else if(count > k){
                s = mid+1;
            }
        }
        return s;
    }
    int[] findMaxAndSum(int[] nums){
        int min = Integer.MIN_VALUE;
        int max = 0;
        int[] vals = new int[2];
        for(int i = 0;i < nums.length;i++){
            min = Math.max(min,nums[i]);
            max += nums[i];
        }
        vals[0] = min;
        vals[1] = max;
        return vals;
    }
}