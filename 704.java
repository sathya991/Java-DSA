class Solution {
    public int search(int[] nums, int target) {
        int a = Arrays.binarySearch(nums,target);
        return a < 0 ? -1 : a;
    }
}