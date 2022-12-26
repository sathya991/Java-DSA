import java.util.*;
class Test {
    public static void main(String args[] ) throws Exception {
        double x = 2;
        int n = 8;
        System.out.println(myPow(x,n));
    }
      public static double myPow(double x, int n) {
        if(n == 0){
            return 1;
        }
        double val = myPow(x,(int)(n/2));
        if(n%2 == 0){
            return val*val;
        }
        else{
            if(n>0){
                return x*val*val;
            }
            else{
                return val*val/x;
            }
        }
    }
}
