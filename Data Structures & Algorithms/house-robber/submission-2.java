class Solution {
     public int rob(int[] nums) {
        int [] dp = new int[nums.length];
        Arrays.fill(dp,-1);
        return houseRobberHelper(nums,0,dp);
    }

    private int houseRobberHelper(int [] nums , int i, int [] dp){
        if(i >= nums.length) return 0;
        if(dp[i] != -1) return dp[i];
        return dp[i] = Math.max(nums[i] + houseRobberHelper(nums,i+2,dp), houseRobberHelper(nums,i+1,dp));
    }
 

}


