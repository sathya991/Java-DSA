class Solution {
    public int findDuplicate(int[] nums) {
        int i = 0;
        while(i < nums.length){
            int correct = nums[i]-1;
              if(nums[i] == nums[correct] && i!=correct){
                return nums[i];
            }
            if(nums[i] == nums[correct]){
                i++;
                continue;
            }
            if(i != correct){
                nums = swap(nums,i,correct);
            }
            else{
                i++;
            }
        }
        return 0;
    }

    public int[] swap(int[] ar,int i,int j){
        int temp = ar[i];
        ar[i] = ar[j];
        ar[j] = temp;
        return ar;
    }

}