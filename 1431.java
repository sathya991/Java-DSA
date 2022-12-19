class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
            int len = candies.length;
          Boolean[] returnAr = new Boolean[len];
            int maxVal = returnMax(candies);
            for(int i = 0;i < len;i++){
                if(candies[i]+extraCandies >= maxVal){
                    returnAr[i] = true;
                }else{
                    returnAr[i] = false;
                }
              
            }
        return Arrays.asList(returnAr);
    }
    
    int returnMax(int[] ar){
        int max = 0;
        for(int i: ar){
            max = Math.max(i,max);
        }
        return max;
    }
}