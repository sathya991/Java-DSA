class Solution {
    public int[] findErrorNums(int[] nums) {
        int i = 0;
        while(i < nums.length){
            int correct = nums[i]-1;
            if(i != correct){
                if(nums[i] == nums[correct]){
                    i++;
                    continue;
                }
                nums = swap(nums,i,correct);
            }
            else{
                i++;
            }
        }
        for(int j = 0;j < nums.length;j++){
            if(nums[j]-1 != j){
                return new int[]{nums[j],j+1};
            }
        }
        return new int[]{0,0};
    }
        public int[] swap(int[] ar,int i,int j){
        int temp = ar[i];
        ar[i] = ar[j];
        ar[j] = temp;
        return ar;
    }
}