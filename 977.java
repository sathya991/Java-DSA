class Solution {
    public int[] sortedSquares(int[] array) {
    int[] returnAr = new int[array.length];
    int j = array.length-1;
    int k = 0;
    for(int i=array.length-1;i >=0 ;i--){
        if(Math.abs(array[k]) < Math.abs(array[j])){
          returnAr[i] = array[j] * array[j];
          j--;
        }
      else{
        returnAr[i] = array[k] * array[k];
        k++;
      }
    }
    return returnAr;
    }
}