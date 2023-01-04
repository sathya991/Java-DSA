import java.util.Arrays;

public class SearchInMatrix {
    public static void main(String[] args){
        // int[][] ar = {{10,20,30,40},{15,25,35,45},{28,29,37,49},{33,34,38,50}};
        int[][] ar = {
            {1, 4, 7, 12, 15, 1000},
            {2, 5, 19, 31, 32, 1001},
            {3, 8, 24, 33, 35, 1002},
            {40, 41, 42, 44, 45, 1003},
            {99, 100, 103, 106, 128, 1004}
          };
        int target = 2;
        System.out.println(Arrays.toString(search(ar, target)));
    }
    public static int[] search(int[][] matrix,int target){
    int r = 0;
    int c = matrix[0].length-1;
    while(r <= matrix.length-1 && c >= 0){
      if(matrix[r][c] == target ){
        return new int[]{r,c};
      }
      else if(target > matrix[r][c]){
        r++;
      }
      else{
        c--;
      }
    }
    return new int[] {-1, -1};
    }

    public static int[] sortedSearch(int[][] arr,int target){
        int r = arr.length;
        int c = arr[0].length;
        if(r == 1){
           return new int[]{0,binarySearch(arr, r-1, target)};
        }
        int rs = 0;
        int re = r-1;
        int cs = 0;
        int ce = c-1;
        int cm = cs+(ce-cs)/2;
        while(rs < re){
            int rm = rs+(re-rs)/2;
            if(arr[rm][cm] == target){
                return new int[]{rm,cm};
            }
            else if(arr[rm][cm] < target){
                rs++;
            }
            else{
                re--;
            }
        }
        if(target >= arr[rs][0] && target <= arr[rs][ce]){
           return new int[]{ rs,binarySearch(arr, rs, target)};
        }
        else if(target >= arr[re][0] && target <= arr[re][ce]){
           return new int[] {re,binarySearch(arr, re, target)};
        }
        return new int[]{-1,-1};
    }
    static int binarySearch(int[][] arr,int row,int target){
        int start = 0;
        int end = arr[row].length-1;
        while(start<=end){
            int mid = start + (end - start)/2;
            if(arr[row][mid] == target){
                return mid;
            }
            else if(target > arr[row][mid]){
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
