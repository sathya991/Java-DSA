class Solution {
    public int trap(int[] height) {
        int i = 0;
        int j = height.length - 1;
        int maxLeft = height[i];
        int maxRight = height[j];
        int sum = 0;
        while (i < j) {
            if (maxLeft < maxRight) {
                i++;
                maxLeft = Math.max(height[i], maxLeft);
                sum += maxLeft - height[i];
            } else {
                j--;
                maxRight = Math.max(height[j], maxRight);
                sum += maxRight - height[j];
            }
        }
        return sum;
    }
}

/*
 * This solution is a bit tough to understand
 * But the basic intuition is that we are trapping water between two blocks
 * so the water in between is going to be a minimum height of the two blocks
 * and the height at certain index will also remove the water of that height at
 * that index
 * Here we start with two pointers at two ends keeping track of max left and max
 * right
 * if max left is less than max right we move maxleft to next and calculate new
 * maxleft and add
 * the value that can be held at that index to sum
 * if not same with right index.
 * O(N) TC
 * O(1) SC
 */