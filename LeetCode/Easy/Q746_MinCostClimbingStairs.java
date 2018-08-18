/* On a staircase, the i-th step has some non-negative cost cost[i] assigned (0 indexed).
 * Once you pay the cost, you can either climb one or two steps. You need to find minimum cost to reach the top of the floor, 
 * and you can either start from the step with index 0, or the step with index 1. 
 * 
 * Approach: Used Dynamic Programming's bottom up approach
 * 
 * @author pramod
 * */


class Q746_MinCostClimbingStairs {
    public int minCostClimbingStairs(int[] cost) {
        int length = cost.length;
        if(length==1)
            return cost[0];
        int[] dp = new int[length];
        dp[0] = cost[0];
        dp[1] = cost[1];
        for(int i =2;i<length;i++){
            dp[i] = cost[i]+Math.min(dp[i-1],dp[i-2]);
        }
        return Math.min(dp[length-1],dp[length-2]);
    }
}