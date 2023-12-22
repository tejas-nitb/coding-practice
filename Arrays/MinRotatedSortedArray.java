public static int findMin(int []arr) {
    return binarySearch(arr, 0, arr.length-1);
}
private static int binarySearch(int[] nums,int l,int h){
    if(l == h) 
        return nums[l];
    if(l == h-1) 
        return Math.min(nums[l],nums[h]);
    if(nums[l] < nums[h]) 
        return nums[l];
    int m = (l+h)/2;
    if(nums[m] < nums[l] && nums[m] < nums[h]) 
        return binarySearch(nums,l,m); 
    else 
        return binarySearch(nums,m,h);
}
