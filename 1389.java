class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> target = new ArrayList<>();
        int[] ar = new int[nums.length];
        int i = 0;
        while(i < nums.length){
            target.add(index[i],nums[i]);
            i++;
        }
        i = 0;
        for(int j: target){
            ar[i] = j;
            i++;
        }
        return ar;
    }
}