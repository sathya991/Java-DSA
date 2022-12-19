class Solution {
    public int largestAltitude(int[] gain) {
        int max = 0;
        int current = 0;
        for(int i: gain){
            current += i;
            if(current > max){
                max = current;
            }
        }
        return max;
    }
}