class Solution {
    public int[] twoSum(int[] nums, int target) {
       Map<Integer,Integer> subs = new HashMap<>();
           int[] ar = new int[2];
       for(int i = 0;i < nums.length;i++){
           subs.put(target-nums[i],i);
       }
        for(int j = 0;j < nums.length;j++){
          int index = subs.getOrDefault(nums[j],-1);
          if(index >= 0){
              if(j == index){
                  continue;
              }
              ar[0] = j;
              ar[1] = index;
          }
        }
    return ar;
    }
}