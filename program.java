import java.util.*;

class Program {
    public static void main(String[] args){
        int[][] intervals = {{1,22},{-20,30}};
        System.out.println(Arrays.toString(mergeOverlappingIntervals(intervals)));
    }

  public static int[][] mergeOverlappingIntervals(int[][] intervals) {
    // Write your code here.
    int[][] returnAr = new int[intervals.length][2];
    Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
    int[] newAr = intervals[0];
    int k = 0;
    for(int i = 0;i < intervals.length-1;i++){
      if(newAr[1] - intervals[i+1][0] >= 0 && intervals[i+1][1] > newAr[1]){
        newAr[1] = intervals[i+1][1];
      }
      else{
        returnAr[k] = newAr;
        k++;
        if(i == intervals.length-1){
            newAr = intervals[i];
        }else{
            newAr = intervals[i+1];
        }
      }
    }
    k++;
    returnAr[k] = newAr;
    int[][] finalAr = Arrays.copyOfRange(returnAr,0,k);
    return finalAr;
  }
}
