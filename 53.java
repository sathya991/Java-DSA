class Solution {
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i : nums) {
            sum += i;
            if (sum > max)
                max = sum;
            if (sum < 0)
                sum = 0;
        }
        return max;
    }
}

/*
 * Here we are going to use Kadanes algorithm
 * Loop through the array
 * Keep two variables maximum value and current sum
 * while looping add each value to sum, if the new sum is greater than max then
 * max = sum
 * if sum goes less than 0, then make sum = 0
 * loop till end and return max
 */