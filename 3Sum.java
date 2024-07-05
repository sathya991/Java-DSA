class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums.length < 3)
            return result;
        Arrays.sort(nums);
        int i = 0;
        while (i < nums.length - 2) {
            if (nums[i] > 0)
                break;
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum == 0)
                    result.add(Arrays.asList(nums[i], nums[j], nums[k]));
                if (sum <= 0)
                    while (nums[j] == nums[++j] && j < k)
                        ;
                if (sum >= 0)
                    while (nums[k--] == nums[k] && j < k)
                        ;
            }
            while (nums[i] == nums[++i] && i < nums.length - 2)
                ;
        }
        return result;
    }
}

/*
 * This Solution is a mix of two sum and two sum 2
 * We first sort the array.
 * Then we start looping the list.
 * we are making sure that we dont have same element in i place twice so we
 * check for that
 * we loop inside with j starting at i+1 and k at end.
 * checking is sum of 3 is 0 if its greater than 0 then we decrease k else we
 * increase j
 * We also check after getting a result the next value of j and k are not same
 * values. because in that case we get repetitive results so
 * we increment and decrement j and k till its not same.
 */