class Solution {
    public boolean isMonotonic(int[] array) {
          if(array.length <= 1){
      return true;
    }
    boolean isAsc = array[array.length-1] - array[0]  >= 0;
    for(int i = 0;i < array.length-1;i++){
      if(isAsc){
        if(array[i] - array[i+1] > 0){
          return false;
        }
      }else{
        if(array[i] - array[i+1] < 0){
          return false;
        }
      }
    }
    return true;
    }
}