class Solution {
    public int[][] merge(int[][] intervals) {
            int[][] returnAr = new int[intervals.length][2];
    Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
    returnAr[0] = intervals[0];
    int k = 0;
    for(int i = 1;i < intervals.length;i++){
      if(intervals[i][0] >= returnAr[k][0] && intervals[i][1] <= returnAr[k][1]){
        continue;
      }
      if(returnAr[k][1] >= intervals[i][0] && returnAr[k][1] <= intervals[i][1]){
        returnAr[k][1] = intervals[i][1];
      }
      else{
        k++;
        returnAr[k] = intervals[i];
      }
    }
    int[][] finalAr = Arrays.copyOfRange(returnAr,0,k+1);
    return finalAr;
    }
}