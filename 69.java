class Solution {
    public int mySqrt(int x) {
         long s = 0;
        long e = x/2;
        while(s <= e){
            long mid = s+(e-s)/2;
            if(mid*mid == x){
                return (int)mid;
            }
            else if(mid*mid > x){
                e = mid-1;
            }
            else{
                if((mid+1)*(mid+1) > x){
                    return (int)mid;
                }
                s = mid+1;
            }
        }
        return (int)s;
    }
}