class Solution {
    public boolean check(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > nums[(i + 1) % nums.length])
                count++;
        }
        if (count > 1)
            return false;
        return true;
    }
}

/*
 * Basic - Find least number in array and loop using modulus to check if its
 * sorted or not
 * 
 * Optimal - For every sorted and rotated array there is only one low point ie.
 * a > b rest all is b > a
 * loop through i to i using modulus to check if there are more than one low
 * point if there are more than one
 * it means its not sorted. ie. 1,2,3,5,2 Here 5 to 2 and 2 to 1 are two low
 * points so its false
 */