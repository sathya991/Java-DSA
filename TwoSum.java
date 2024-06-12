class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hMap.containsKey(nums[i])) {
                return new int[] { i, hMap.get(nums[i]) };
            } else {
                hMap.put(target - nums[i], i);
            }
        }
        return new int[] { 0, 0 };
    }
}

/*
 * Basic - Do a nested loop and add to compare with target
 * 
 * Optimal - Take a hashmap and loop through array and check if val exists in
 * map
 * if not add it to map as index as key and target - val as value
 * if val exists in map then return index of current val and index of target -
 * val from map
 */