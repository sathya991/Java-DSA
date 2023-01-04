class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();
        int i = 0;
        while(i < nums.length){
            if(nums[i] > nums.length || nums[i] == nums[nums[i] - 1]){
                i++;
                continue;
            }
            if(i != nums[i]-1){
                nums = swap(nums,nums[i]-1,i);
            }
            else{
                i++;
            }
        }
        for(int j = 0;j < nums.length;j++){
            if(nums[j] != j+1){
                result.add(j+1);
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