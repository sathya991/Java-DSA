class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int s = 0;
        int e = arr.length-1;
        int maxEl = 0;
             int mid = (s+e)/2;      
        while(s <= e){
             maxEl = mid;
            if(arr[mid-1] > arr[maxEl]){
                maxEl = mid-1;
                e = mid;
            }
            else if(arr[mid+1] > arr[maxEl]){
                maxEl = mid+1;
                s = mid;
            }
            else{
                break;
            }
            mid = (s+e)/2;
    }
    return maxEl;
}
}