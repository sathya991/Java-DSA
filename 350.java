class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int[] ar = new int[1001];
        int[] returnAr = new int[1001];

        int count = 0;
        for(int i: nums1){
            ar[i]++;
        }
        for(int j: nums2){
            if(ar[j] > 0){
                returnAr[count++] = j;
                ar[j]--;
            }
        }
        return Arrays.copyOfRange(returnAr,0,count);
        }
}