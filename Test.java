import java.util.*;
class Test {
    public static void main(String args[] ) throws Exception {
        // double x = 2;
        // int n = 8;
        int[] ar = {3,4,-1,1};
        System.out.println(firstMissingPositive(ar));
    }
    public static int firstMissingPositive(int[] nums) {
        int i = 0;
        int j = nums.length-1;
        int min = min(nums);
        if(min <= 0){
            min = 1;
        }
        if(min > 1){
            return 1;
        }
        while(i < j){
            if(nums[i] <= 0){
                swap(nums,i,j);
                j--;
                continue;
            }
            int correct = nums[i]-min;
            if(i != correct){
                if(correct > nums.length-1){
                    nums = swap(nums,i,correct-1);
                    i++;
                    continue;
                }
                nums = swap(nums,i,correct);
            }else{
                i++;
            }
        }
        for(int k = 0;k < nums.length;k++){
            if(nums[k]-min != k){
                return k+1;
            }
        }
        return nums[nums.length-1]+1;
    }
         public static int[] swap(int[] ar,int i,int j){
            int temp = ar[i];
            ar[i] = ar[j];
            ar[j] = temp;
            return ar;
        }

        public static int min(int[] ar){
            int min = Integer.MAX_VALUE;
            for(int i: ar){
                min = Math.min(i,min);
            }
            return min;
        }
        
}
