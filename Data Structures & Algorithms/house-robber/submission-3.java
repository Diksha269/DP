class Solution {
     public int rob(int[] nums) {
        int [] dp = new int[nums.length];
        Arrays.fill(dp,-1);
        return houseRobberHelperII(nums,dp);
    }

    // max amount if starts from ith ()
    private int houseRobberHelperI(int [] nums , int i, int [] dp){
        if(i >= nums.length) return 0;
        if(dp[i] != -1) return dp[i];
        return dp[i] = Math.max(nums[i] + houseRobberHelperI(nums,i+2,dp), houseRobberHelperI(nums,i+1,dp));
    }

    // dp[i] = max amount if rob from 0:ith (starting from 0 to build the solution)

    private int houseRobberHelperII(int [] nums, int [] dp){
        int n = nums.length;
        for(int i=0; i<n; i++){
            if(i==0) dp[i] = nums[0];
            else if(i==1) dp[i] = Math.max(nums[1],nums[0]);
            else dp[i] = Math.max(nums[i]+dp[i-2],dp[i-1]);
        }
        return dp[n-1];

    }
}

/*

dp[i] = nums[i] + dp[i-2];
dp[i] = dp[i-1];



*/


