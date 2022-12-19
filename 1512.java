class Solution {
    public int numIdenticalPairs(int[] nums) {
    Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        int totalCount = 0;
        for(int i = nums.length-1;i>=0;i--){
            int count = map.getOrDefault(nums[i],0);
            totalCount += count;
            map.put(nums[i],count+1);
        }
        return totalCount;
}
}