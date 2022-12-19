class Solution {
    public int arrangeCoins(int n) {
       long s = 1;
       long e = (long)n;
       while(s <= e){
           long mid = s+(e-s)/2;
           long gaussSum = (mid*(mid+1))/2;
           if(gaussSum == n){
               return (int)mid;
           }
           else if(gaussSum > n){
               e = mid-1;
           }
           else { 
               s = mid+1;
           }
       }
        return (int)e;
    }
}