import java.util.Arrays;

class Sort{
    public static void main(String[] args){
        int[] ar = {5,2,3,1,0};
        System.out.println(Arrays.toString(cyclicSort(ar)));
    }

    public static int[] bubbleSort(int[] ar){
        for(int i = 0;i < ar.length;i++){
            boolean swapped = false;
            for(int j = 1;j < ar.length-i;j++){
                if(ar[j] < ar[j-1]){
                    swapped = true;
                    ar = swap(ar, j-1, j);
                }
            }
            if(!swapped){
                break;
            }
        }
        return ar;
    }

    public static int[] swap(int[] ar,int i,int j){
        int temp = ar[i];
        ar[i] = ar[j];
        ar[j] = temp;
        return ar;
    }


    public static int[] selectionSort(int[] ar){
        for(int i = 0;i < ar.length;i++){
            int max = -1;
            int maxIndex = -1;
            for(int j = 0;j < ar.length-i;j++){
                 max = Math.max(ar[j],max);
                if(max == ar[j]){
                    maxIndex = j;
                }
            }
            if(maxIndex >= 0){
                ar = swap(ar, maxIndex, ar.length-i-1);
            } 
           
        }
        return ar;
    }

    public static int[] insertionSort(int[] array){
        int k = array.length;
        for(int i = 1;i < k;i++){
          for(int j = i-1;j>=0;j--){
            if(array[j+1] < array[j]){
              array = swap(array,j+1,j);
            }
            else{
              break;
            }
          }
        }
        return array;
    }


    public static int[] cyclicSort(int[] ar){
        for(int i = 0;i < ar.length;i++){
            int count = numberOfElementsLess(ar[i], ar);
            ar = swap(ar, i, count);
        }
        return ar;
    }
    public static int numberOfElementsLess(int curEl, int[] ar){
        int count = 0;
        for(int i:ar){
            if(i < curEl){
                count++;
            }
        }
        return count;
    }
  

}