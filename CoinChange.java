public static int coinChange(int[] coins, int amount){
        int[] dp = new int[amount+1];
        for(int i=0;i<=amount;i++)
            dp[i] = Integer.MAX_VALUE;
        
        dp[0] = 0;
        for(int i = 1; i<=amount ; i++) {
            for(int j : coins) {
                if(i-j >= 0 && dp[i-j] != Integer.MAX_VALUE)
                    dp[i] = Math.min(dp[i], 1+dp[i-j]);
            }
        }
        if(dp[amount] == Integer.MAX_VALUE) 
            return -1;
        else 
            return dp[amount];
    }
