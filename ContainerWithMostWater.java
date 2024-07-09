class Solution {
    public int maxArea(int[] height) {
        int minHeight;
        int maxCapacity = 0;

        int i = 0;
        int j = height.length - 1;

        while (i < j) {
            minHeight = Math.min(height[i], height[j]);
            maxCapacity = Math.max(maxCapacity, minHeight * (j - i));

            while (i < j && height[i] <= minHeight) {
                i++;
            }
            while (i < j && height[j] <= minHeight) {
                j--;
            }
        }

        return maxCapacity;
    }
}

/*
 * The basic method can be done with normal brute looping
 * checking each box size.
 * The optimal solution is a mix of two pointer and sliding window
 * We take pointers at both ends and start looping inwards
 * Checking the minimum height in both i and j because thats the level of water
 * it can hold
 * We take the maxcapacity at each loop keeping track of max value it can hold
 * here in each loop we move i if the height is less than minimum height
 * else we move j
 */