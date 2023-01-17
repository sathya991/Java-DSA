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
        System.out.println(nextGreaterElement(ar));
       
    }
 
    public static int[] nextGreaterElement(int[] array) {
      // Write your code here.
      int[] returnAr = new int[array.length];
      Stack<Integer> stack = new Stack<>();
      for(int i = array.length-1;i >=0 ;i--){
        stack.push(array[i]);
      }
      int n = 0;
      int max = stack.pop();
      int firstMax = max;
      boolean isFirst = true;
      int k = 0;
      for(int j = 0;j < array.length;j++){
        int p = stack.pop();
            
      }
      
      return returnAr;
    }
    }
