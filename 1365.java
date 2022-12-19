class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
         int[] returnAr = new int[nums.length];
         int k = 0;
        for(int i: nums){
            int count = 0;
            for(int j: nums){
                if(j < i){
                    count++;
                }
            }
        returnAr[k] = count;
        k++;
        }
        return returnAr;
    }
}