class Solution {
    public int missingNumber(int[] nums) {
        int i = 0;
        while(i < nums.length){
            if(nums[i] > nums.length-1){
                i++;
                continue;
            }
            if(i != nums[i]){
                nums = swap(nums,i,nums[i]);
            }
            else{
                i++;
            }
        }
        for(int j = 0;j < nums.length;j++){
            if(nums[j] > nums.length-1){
                return j;
            }
        }
        return nums.length;
    }
      public int[] swap(int[] ar,int i,int j){
        int temp = ar[i];
        ar[i] = ar[j];
        ar[j] = temp;
        return ar;
    }
}