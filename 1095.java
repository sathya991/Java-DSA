/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int peak = findPeakElement(mountainArr);
        int firstBs = orderAgnosticBS(mountainArr,target,0,peak);
        int secondBs = orderAgnosticBS(mountainArr,target,peak+1,mountainArr.length()-1);
        if(firstBs != -1){
            return firstBs;
        }
        else{
            if(secondBs != -1){
                return secondBs;
            }
            return -1;
        }
    }
     public int findPeakElement(MountainArray mountainArr) {
       int s = 0;
       int e = mountainArr.length()-1;
       while(s < e){
           int mid = s+(e-s)/2;
           if(mountainArr.get(mid) > mountainArr.get(mid+1)){
               e = mid;
           }
           else{
               s = mid+1;
           }
       }
       return s;
    }
     public int orderAgnosticBS(MountainArray ma,int target,int start,int end){
        boolean isAsc = ma.get(start) < ma.get(end);
        while(start<=end){
            int mid = start + (end - start)/2;
            int midVal = ma.get(mid);
            if(midVal == target){
                return mid;
            }
            if(isAsc){
                if(target > midVal){
                    start = mid + 1;
                }
                else {
                    end = mid - 1;
                }
            }
            else{
                if(target < midVal){
                    start = mid + 1;
                }
                else {
                    end = mid - 1;
                }
            }
      
        }
        return -1;
    }

}