import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

// import java.util.Arrays;
// import java.util.Collections;

public class LeetCode {
    public static void main(String[] args){
       int[] num1 = {4,9,5};
       int[] nums2 = {9,4,9,8,4};
        System.out.println(Arrays.toString(countNegatives(num1,nums2)));
    }
    public static int[] countNegatives(int[] nums1,int[] nums2) {
        Set<Integer> vals = new HashSet<>();
        Set<Integer> vals2 = new HashSet<>();
       int len1 = nums1.length;
       int len2 = nums2.length;
       int[] searchAr;
       if(len1 < len2){
           for(int i: nums1){
               vals.add(Integer.valueOf(i));
           }
           Arrays.sort(nums2);
           searchAr = nums2;
       }else{
           for(int i: nums2){
               vals.add(Integer.valueOf(i));
           }
             Arrays.sort(nums1);
              searchAr = nums1;
           }
            for(Integer j: vals){
                int valNow = Arrays.binarySearch(searchAr,j.intValue());
            if(valNow < 0){
                vals2.add(j);
                }
           }
           int[] ar = new int[vals2.size()];
           int i = 0;
           for(int num : vals2) ar[i++] = num;
           return ar;
       }
}
