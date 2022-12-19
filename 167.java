class Solution {
    public int[] twoSum(int[] numbers, int target) {

      for(int i = 0;i < numbers.length;i++){
          int targetNow = target-numbers[i];
            int s = 0;
            int e = numbers.length-1;
      while(s<=e){
          int mid = s+(e-s)/2;
          if(numbers[mid] == targetNow && mid!= i){
              return new int[]{Math.min(i+1,mid+1),Math.max(i+1,mid+1)};
          }
          else if(targetNow > numbers[mid]){
              s = mid+1;
          }
          else{
              e = mid-1;
          }
      }
      }
      return new int[]{-1,-1};

    }
}