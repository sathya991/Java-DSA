class Solution {
    public int missingNumber(int[] nums) {
     int len = nums.length;
     int totalSum = len*(len+1)/2;
     int sum = 0;
     for(int i : nums){
         sum+=i;
     }
     return totalSum - sum;
    }
}