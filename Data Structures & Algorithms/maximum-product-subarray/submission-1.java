class Solution {
    public int maxProduct(int[] nums) {
        int ans = nums[0], n = nums.length;
        for(int i=0; i<n; i++){
            int product = 1;
            for(int j=i; j<n; j++){
                product = product * nums[j];
                ans = Math.max(ans,product);
            }
        }
        return ans;

    }
}


/*



*/