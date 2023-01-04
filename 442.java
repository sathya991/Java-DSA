class Solution {
    public List<Integer> findDuplicates(int[] nums) {
      int i = 0;
      List<Integer> result = new ArrayList<>();
        while(i < nums.length){
            int correct = nums[i]-1;
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
        for(int j = 0;j < nums.length;j++){
            if(nums[j]-1 != j){
                result.add(nums[j]);
            }
        }
        return result;
    }

    public int[] swap(int[] ar,int i,int j){
        int temp = ar[i];
        ar[i] = ar[j];
        ar[j] = temp;
        return ar;
    }
}