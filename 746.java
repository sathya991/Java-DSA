class Solution {
    public int minCostClimbingStairs(int[] cost) {
        // int[] minCost = new int[cost.length];
        int n = cost.length;
        // Arrays.fill(minCost,-1);
        // int ans = Math.min(costCal(cost,minCost,n-1),costCal(cost,minCost,n-2));
        int[] dp = new int[cost.length+1];
        dp[0] = cost[0];
        dp[1] = cost[1];
        for(int i = 2;i < cost.length;i++){
            dp[i] = cost[i] + Math.min(dp[i-1],dp[i-2]); 
        }
        return Math.min(dp[n-1],dp[n-2]);
    }
    // public int costCal(int[] cost,int[] minCost,int n){
    //     if(n == 0) return cost[0];
    //     if(n == 1) return cost[1];
    //     if(minCost[n] != -1) return minCost[n];
    //     minCost[n] = cost[n] + Math.min(costCal(cost,minCost,n-1),costCal(cost,minCost,n-2)); 
    //     return minCost[n];
    // }
}