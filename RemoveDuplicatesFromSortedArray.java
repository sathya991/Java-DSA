class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        int cur = 0;
        while (cur < nums.length) {
            if (nums[cur] != nums[i]) {
                i++;
                nums[i] = nums[cur];
            }
            cur++;
        }
        return i + 1;
    }
}

/*
 * keep a uniqueNumber index and normal index,
 * Loop the normal index to check if uniqueNumber Index == normal Index number
 * if not then add that normal index to unique index and move ahead
 * if not keep looping normal index till end of array
 */