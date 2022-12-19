class Solution {
    public int findKthPositive(int[] arr, int k) {
        int s = 0;
        int e = arr.length-1;
        int prevDiff = 0;
        int mid = s+(e-s)/2;
        int diff = arr[mid] - (mid+1);
        if((arr[e] - e) < k){
            return arr[e] + (k-(arr[e]-(e+1)));
        }
        while(s < e){
             mid = s+(e-s)/2;
            diff = arr[mid] - (mid+1);
            if(k<=diff){
                e = mid-1;
            }
            else{
                s = mid+1;
            }
        }
        if(arr[s] - (s+1) == 0){
            return arr[s]+k;
        }
        else if(arr[s] - (s+1) > 0 &&  (arr[s] - (s+1) >= k)){
            return (arr[s]-1)-((arr[s]-(s+1))-k);
        }
        else{
            return (arr[s] + (k-(arr[s]-(s+1))));
        }
    }
}