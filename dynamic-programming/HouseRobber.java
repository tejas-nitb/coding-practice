public static int rob(int[] nums) {
        if(nums.length == 1) {
            return nums[0];
        }
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[1],dp[0]);
        
        for(int i=2;i<nums.length;i++) {
            int incHouse = dp[i-2] + nums[i];
            int excHouse = dp[i-1];
            dp[i] = Math.max(incHouse,excHouse);
        }
        
        return dp[nums.length - 1];
}
