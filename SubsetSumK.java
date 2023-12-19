public static boolean subsetSumToK(int n, int k, int arr[]){
    boolean[][] dp = new boolean[n+1][k+1];
    for(int i=0;i<n+1; i++) {
        dp[i][0] = true;
    }
    for(int i = 1; i < n+1; i++) {
        for(int j=1; j<k+1; j++) {
            int taken = arr[i-1];
            if(taken <= j && dp[i-1][j-taken]) {
                dp[i][j] = true;
            } else if(dp[i-1][j]) {
                dp[i][j] = true;
            }
        }
    }
    return dp[n][k];
}
