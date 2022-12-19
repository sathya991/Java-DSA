class Solution {
    public int findNumbers(int[] nums) {
        int totalCount = 0;
        for(int i:nums){
          if(isEven(i)){
              totalCount++;
          }
        }
        return totalCount;
    }
    boolean isEven(int i){
        int digits = numOfDigits(i);
        if(digits%2 == 0){
            return true;
        }
        return false;
    }
    int numOfDigits(int i){
        if(i<0){
            i = i*-1;
        }
        return (int)(Math.log10(i))+1;
    }
}