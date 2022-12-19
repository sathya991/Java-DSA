class Solution {
    public boolean isPerfectSquare(int num) {
        long s = 1;
        long e = (long)num != 1 ? (long)num/2:(long)num;
        while(s<=e){
            long mid = s+(e-s)/2;
            if(mid*mid == num){
                return true;
            }
            else if(mid*mid < num){
                s = mid+1;
            }
            else {
                e = mid-1;
            }
        }
        return false;
    }
}