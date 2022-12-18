import java.util.Arrays;

class Test {
    public static void main(String[] args){
        // int[][] ar = {{1,2,3},{4,5,6},{7,8,9}};
        // int[][] ar = {{1,11},{2,12},{3,13},{4,14},{5,15},{6,16},{7,17},{8,18},{9,19},{10,20}};
        // int[] ar = {2,3,5,9,14,16,18};
        // int target = 0;
        // System.out.println(ceilClosesOfArray(ar,target));
        // System.out.println(floorClosesOfArray(ar,target));
        // char[] ar = {'c','f','j'};
        // char target = 'g';
        // System.out.println(nextGreatestLetter(ar, target));
        // int[] nums = {5,7,8,10,15,18,20,25,29};
        // int target = 8;
        // System.out.println(Arrays.toString(searchRange(nums, target)));
        // System.out.println(infiniteArraysearch(nums, target));
        int[] ar = {6,5,4,3,2,3,2};
        System.out.println(findPeakElement(ar));

    }
    public static int ceilClosesOfArray(int[] arr,int target) {
        int s = 0;
        int e = arr.length-1;
        int mid = (s+e)/2;
        if(target > arr[arr.length-1]){
            return -1;
        }
        while(s<=e){
            mid = (s+e)/2;
            if(arr[mid] == target){
                return arr[mid];
            }
            else if(arr[mid]> target){
                e = mid-1;
            }
            else {
                s = mid+1;
            }
            
        }
        return arr[s];
}
public static int floorClosesOfArray(int[] arr,int target) {
    int s = 0;
    int e = arr.length-1;
    int mid = (s+e)/2;
    if(target < arr[0]){
        return -1;
    }
    while(s<=e){
        mid = (s+e)/2;
        if(arr[mid] == target){
            return arr[mid];
        }
        else if(arr[mid]> target){
            e = mid-1;
        }
        else {
            s = mid+1;
        }
        
    }
    return arr[e];
}

public static char nextGreatestLetter(char[] letters, char target) {
    int s = 0;
    int e = letters.length-1;
    if(((int)target > (int)letters[letters.length-1]) || ((int)target < (int) letters[0])){
        return letters[0];
    }
    while(s <= e){
        int mid = (s+e)/2;
        if((int)letters[mid] == (int)target){
            if(mid+1 > letters.length-1){
                return letters[0];
            }
            return letters[mid+1];
        }
        if((int)letters[mid] > (int)target ){
            e = mid -1;
        }
        else if((int)letters[mid] < (int)target){
            s = mid+1;
        }
    }
    return letters[s];
}

public static int[] searchRange(int[] nums, int target) {
    int s = 0;
    int e = nums.length-1;
    int[] ar = {-1,-1};
    ar[0] = bs(s, e, target, nums, true);
    ar[1] = bs(s, e, target, nums, false);
    return ar;
}
public static int bs(int s, int e,int target,int[] nums,boolean elementBefore){
    int ans = -1;
      while(s <= e){
        int mid = s+(e-s)/2;  
        if(nums[mid] > target){
            e = mid-1;
        }
        else if(target > nums[mid]){
            s = mid+1;
        }
        else{
            ans = mid;
            if(elementBefore){
                e = mid-1;
            }
            else{
                s = mid+1;
            }
        }
    }
    return ans;
}


public static int infiniteArraysearch(int[] ar, int target){
   int[] points = correctChunk(ar,target);
   int s = points[0];
   int e = points[1];
    while(s<=e){
     int mid = s+(e-s)/2;
     if(ar[mid] == target){
        return mid;
     }
     else if(ar[mid] > target){
        e = mid-1;
     }
     else {
        s = mid+1;
     }
    }
    return -1;
}
public static int[] correctChunk(int[] ar,int target){
    int s = 0;
    int e = 1;
    int[] returnAr = new int[2];
    boolean notFound = true;
    while(notFound){
        if(target <= ar[e]){
            returnAr[0] = s;
            returnAr[1] = e;
            notFound = !notFound;
        }else{
            int temp = s;
            s = e+1;
            e = e+(e-temp+1)*2;
            
        }
    }
    return returnAr;
}
public static int findPeakElement(int[] nums) {
    int[] tempAr = nums.clone();
    Arrays.sort(tempAr);
    int max = tempAr[nums.length-1];
    return bss(nums,max);
}
public static int bss(int[] arr,int target){
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