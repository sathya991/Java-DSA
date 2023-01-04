class Solution {
    public int firstMissingPositive(int[] nums) {
        int i = 0;
        while(i < nums.length){
            if(nums[i] <= 0 || nums[i] > nums.length-1){
                i++;
                continue;
            }
            int correct = nums[i] - 1;
            if(i != correct && nums[i] == nums[correct]){
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
               for(int j = 0;j < nums.length;j++){
                if(nums[j]-1 != j){
                    return j+1;
                }
            }
     return nums[nums.length-1]+1;
    }
         public int[] swap(int[] ar,int i,int j){
            int temp = ar[i];
            ar[i] = ar[j];
            ar[j] = temp;
            return ar;
        }


}