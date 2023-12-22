public static long maxSubarraySum(int[] arr, int n) {
		long max=Integer.MIN_VALUE;
    long sum=arr[0];
    for(int i=1;i<n;i++){
      if(sum<0)
       	sum=0;
			sum+=arr[i];
			max=Math.max(max,sum);
    }
    if(max<0)
			return 0;
		return max;
}
