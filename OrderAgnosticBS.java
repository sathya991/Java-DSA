public class OrderAgnosticBS {
    public static void main(String[] args){
        int[] arr = {60,50,40,30,20,10,5,-9};
        int target = 50;
        System.out.println(orderAgnosticBS(arr, target));
    }

    static int orderAgnosticBS(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;
        boolean isAsc = arr[start] < arr[end];
        while(start<=end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                return mid;
            }
            if(isAsc){
                if(target > arr[mid]){
                    start = mid + 1;
                }
                else {
                    end = mid - 1;
                }
            }
            else{
                if(target < arr[mid]){
                    start = mid + 1;
                }
                else {
                    end = mid - 1;
                }
            }
      
        }
        return -1;
    }
}
