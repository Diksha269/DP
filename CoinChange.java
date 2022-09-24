class Solution {
    public int coinChange(int[] coins, int amount) {
        return solveUsingTabulation(coins , amount);
     
    }
    // using memoization
    public int solve(int [] coins , int amount , int n){
        if(amount == 0 ) return 0;
        if(n== 0 && amount != 0) return 1000000007; 
        if(coins[n-1] <= amount){
            return Math.min(1+solve(coins, amount - coins[n-1],n) ,0+solve(coins , amount  , n-1) );
        }
        else{
            return solve(coins , amount , n-1);
        }
        
    }
    // using tabulation
    public int solveUsingTabulation(int [] arr, int amount){
        int n = arr.length;
        int [][] dp = new int[n+1][amount+1];
        dp[0][0] = 0;
        
        for(int i = 0 ; i<= n ; i++){
            for(int j = 0 ; j<= amount ; j++){
            
                if(i== 0 && j==0) dp[i][j] = 0;
                else if(i==0 && j>0) dp[i][j] = 1000000007;
                else if(j==0 && i>0) dp[i][j] = 0;
                else if(arr[i-1] <= j){
                    dp[i][j] = Math.min(1+dp[i][j - arr[i-1]] , dp[i-1][j]);
                }
                else{
                    dp[i][j] = dp[i-1][j];
                }
                
            }
        }
        return dp[n][amount] == 1000000007 ? -1 : dp[n][amount] ;
    }
}
