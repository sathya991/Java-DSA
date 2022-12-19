public class BinarySearch {
    public static void main(String[] args){
        int[] arr = {2,4,6,7,8,10,20,50,60};
        int target = 50;
        System.out.println(binarySearch(arr, target));
    }
    static int binarySearch(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                return mid;
            }
            else if(target > arr[mid]){
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
