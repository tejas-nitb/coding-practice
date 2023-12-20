public static int lengthOfLIS(int[] nums) {
  int n = nums.length;
  List<Integer> answer = new ArrayList<>();
  answer.add(nums[0]);
  for(int i=1; i<n; i++) {
    if(nums[i] > answer.get(answer.size() - 1)) {
      answer.add(nums[i]);
    }  else {
      int low = Collections.binarySearch(answer, nums[i]);
      if(low < 0) {
        low = - (low+1);  
      }
      answer.set(low, nums[i]);
    }
  }
  return answer.size();
}
