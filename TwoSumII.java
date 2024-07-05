class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int start = 0;
        int end = numbers.length - 1;
        while (start < end) {
            int curSum = numbers[start] + numbers[end];
            if (curSum > target)
                end--;
            else if (curSum < target)
                start++;
            else
                return new int[] { start + 1, end + 1 };
        }
        return new int[] { 1, 1 };
    }
}

/*
 * Basic brute method is to take two pointers one at start and one at end then
 * start
 * checking if sum of both is target
 * if the sum is greater than target we move the end pointer one down,
 * if the sum is less then increase start pointer by one
 * we keep doing this till we get a solution.
 * This works because the array is already sorted and there is defintely a
 * solution.
 */