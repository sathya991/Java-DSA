/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes

*/

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail
import java.util.*;
class Test {
    public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        //Scanner
       // Writing output to STDOUT

        */

        // Write your code here
        int[] ar = new int[3];
        Scanner scan = new Scanner(System.in);
        final String line = scan.nextLine();
        final Scanner lineScanner = new Scanner(line);
        int i = 0;
        while(lineScanner.hasNextInt()) {
            ar[i] = lineScanner.nextInt();
            i++;
        }  
        int a = ar[0];
        int b = ar[1];
        int k = ar[2];  
        boolean isATurn = true;    
        while(k>0){
            if(isATurn){
                 if(isOdd(a)){
                a--;
            }
            int temp = a/2;
            b+= temp;
            a = temp;
         
            }else{
                     if(isOdd(b)){
                b--;
            }
            int temp = b/2;
            a+= temp;
            b = temp;
            }
            isATurn = !isATurn;
           k--;
        }
        System.out.println(a+" "+b);

    }
    public static boolean isOdd(int val){
        return val%2 != 0;
    }
}
