class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> count = new HashSet<>();
        for (int num : nums) {
            if (count.contains(num))
                return true;
            else
                count.add(num);
        }
        return false;
    }
}

/*
 * Basic - Sort and find compare side by side values
 * 
 * Optimal - Take a hashset or a hashmap and keep count to check if any value
 * repeats twice.
 */