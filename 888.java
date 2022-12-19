class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int aSum = sum(aliceSizes);
        int bSum = sum(bobSizes);
        Arrays.sort(bobSizes);
        int mid = aSum+(bSum-aSum)/2;
        for(int i: aliceSizes){
            int a = Arrays.binarySearch(bobSizes,(bSum+i)-mid);
            if(a >= 0){
                return new int[]{i,bobSizes[a]};
            }
        }
        return new int[]{-1,-1};
    }
    public int sum(int[] ar){
        int s = 0;
        for(int i: ar){
            s += i;
        }
        return s;
    }
}