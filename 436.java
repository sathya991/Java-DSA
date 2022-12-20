class Solution {
    public int[] findRightInterval(int[][] intervals) {
      int[] starts = new int[intervals.length];
        int[] ends = new int[intervals.length];
        int[] returnAr = new int[intervals.length];
        Map<Integer,Integer> indexVals = new HashMap<>();
        for(int i = 0;i < intervals.length;i++){
            starts[i] = intervals[i][0];
            ends[i] = intervals[i][1];
            indexVals.put(Integer.valueOf(starts[i]),Integer.valueOf(i));
        }
        Arrays.sort(starts);
        int k = 0;
        for(int j = 0;j < ends.length;j++){
          if(intervals[j][0] == intervals[j][1]){
                returnAr[k] = j;
                k++;
                continue;
            }
            int val = bs(starts,ends[j]);
            if(val >= ends[j]){
               Integer a = indexVals.get(Integer.valueOf(val));
               returnAr[k] = a.intValue();
            }
            else{
                returnAr[k] = -1;
            }
            k++;
        }
        return returnAr;
    }
     int bs(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            int mid = start + (end - start)/2;
            if(start == mid){
                break;
            }
            if(arr[mid] == target){
                return arr[mid];
            }
            else if(target > arr[mid]){
                start = mid;
            }
            else {
                end = mid;
            }
        }
        return arr[end];
    }
    
}