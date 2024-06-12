import java.util.*;
class Test {
    public static void main(String args[] ) throws Exception {
        // double x = 2;
        // int n = 8;
        // ArrayList<Integer> ar = new ArrayList<>();
        // // 2, 4, 22, 1, -9, 0, 6, 23, -2, 1
        // ar.add(2);
        // ar.add(4);
        // ar.add(22);
        // ar.add(1);
        // ar.add(-9);
        // ar.add(0);
        // ar.add(6);
        // ar.add(23);
        // ar.add(-2);
        // ar.add(1);
        // String s = "1905";
        int[] ar = {2,5,-3,-4,6,7,2};
        System.out.println(climbStairs(35));
       
    }
 
  
      public static int climbStairs(int n) {
          int[] count = {0};
          distinctCount(n,count,0);
          return count[0];
      }
  
      public static void distinctCount(int n,int[] count,int steps){
         if(steps == n){
             count[0]++;
             return;
         } 
         if(steps > n){
             return;
         }
         else{
         distinctCount(n,count,steps+1);
         distinctCount(n,count,steps+2);
         } 
  }
  
    }


    // SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
    // Date end = sdf.parse(jobDetails.get(i).getEndTime());
    // Date start = sdf.parse(jobDetails.get(i).getStartTime());

    // for(int i = 0;i < jobDetails.size();i++){
    //     AddedBatchReport temp = new AddedBatchReport();
    //     temp.runTime = jobDetails.get(i).endTime - jobDetails.get(i).startTime;
    //     temp.stepName = jobDetails.get(i).stepName;
    //     temp.startTime = jobDetails.get(i).startTime;
    //     temp.endTime = jobDetails.get(i).endTime;
    //     temp.writeCount = jobDetails.get(i).writeCount;
    //     temp.commitCount = jobDetails.get(i).commitCount;
    //     temp.exitCode = jobDetails.get(i).exitCode;
    //     addedJobDetails.add(temp);
    // }