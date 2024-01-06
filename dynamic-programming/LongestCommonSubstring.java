public static int lcs(String str1, String str2){
        int l1 = str1.length();
        int l2 = str2.length();
        int dp[][] = new int[2][l2+1];
        int result = 0;
        for(int i=1;i<=l1;i++) {
            for(int j=1;j<=l2;j++) {
                if(str1.charAt(i-1) == str2.charAt(j-1)) {
                    dp[i%2][j] = dp[(i-1)%2][j-1]+1;
                    if(dp[i%2][j] > result) {
                        result = dp[i%2][j];
                    }
                } else {
                    dp[i%2][j] = 0;
                }
            }
        }
        return result;
    }
