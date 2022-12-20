class Solution {
    public int reachNumber(int target) {
         int curSum = 0;
        int steps = 1;
        target = Math.abs(target);
        while(curSum < target){
            curSum+=steps;
            if(curSum < target){
                    steps++;
            }
        }
        while((curSum-target)%2 != 0){
            steps++;
            curSum+=steps;
        }
        return steps;
    }
}