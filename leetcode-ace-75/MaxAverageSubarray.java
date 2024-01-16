public double findMaxAverage(int[] nums, int k) {
        long wSum = 0;
        for(int i = 0; i < k ; i++ ) {
            wSum += nums[i];
        }
        double mSum = (double) wSum / k;
        for(int i = k; i < nums.length ; i++) {
            wSum = wSum - nums[i - k] + nums[i];
            mSum = Math.max((double)wSum / k, mSum);
        }
        return mSum;
}
