public int longestSubarray(int[] nums) {
        int previousCount = 0;
        int currentCount = 0;
        int maximumCount = 0;
        int length = nums.length;
        for(int i = 0; i < length ; i++) {
            if(nums[i] == 1) {
                currentCount++;
            } else {
                maximumCount = Math.max(maximumCount, previousCount + currentCount);
                previousCount = currentCount;
                currentCount = 0;
            }
        }
        maximumCount = Math.max(maximumCount, previousCount + currentCount);
        return maximumCount == length ? maximumCount - 1 : maximumCount;
}
