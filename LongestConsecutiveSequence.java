class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0)
            return 0;
        Set<Integer> trackSet = new HashSet<>();
        for (int num : nums) {
            trackSet.add(num);
        }
        int max = 1;
        for (int num : nums) {
            if (!trackSet.contains(num - 1)) {
                int temp = 1;
                while (trackSet.contains(num + 1)) {
                    temp++;
                    num++;
                }
                if (temp > max)
                    max = temp;
            }
            if (max > nums.length / 2)
                break;
        }
        return max;
    }
}

/*
 * The basic solution is to sort and check for consecutive numbers
 * The optimal solution is
 * Take a set and add all numbers into it.
 * Then start looping the array to check if the previous number exists for it in
 * the set
 * Basically we are checking if that number is start of a consecutive count
 * if it doesnt have previous number in set then we keep checking in set till
 * the next number doesnt exist
 * while counting the length.
 * If that length is the maximum by the time loop ends or if the length is
 * greater than half of size of array then its the solution.
 * 
 */