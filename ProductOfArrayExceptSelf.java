class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] sufx = new int[nums.length];
        int[] prefx = new int[nums.length];
        sufx[0] = 1;
        prefx[nums.length - 1] = 1;
        for (int i = 1; i < nums.length; i++) {
            sufx[i] = nums[i - 1] * sufx[i - 1];
        }
        for (int j = nums.length - 2; j >= 0; j--) {
            prefx[j] = nums[j + 1] * prefx[j + 1];
        }
        for (int k = 0; k < nums.length; k++) {
            nums[k] = sufx[k] * prefx[k];
        }
        return nums;
    }
}
/*
 * Take two extra arrays to keep track of multiplication from backwards and
 * forwards
 * [1,1,2,6]
 * [1,2,3,4]
 * [24,12,4,1]
 * As above we took the first value and last value as 1 and multiplied till end
 * of array forwards and backwards
 * Then we multiply those both to get solution array
 * [24*1,12*1,4*2,1*6]
 */