public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
      return Arrays.asList(getElements(nums1, nums2), getElements(nums2, nums1));
}

private List<Integer> getElements(int[] nums1, int[] nums2) {
        Set<Integer> onlyNums1 = new HashSet<>();
        Set<Integer> existsInNums2 = new HashSet<>();
        for(int num : nums2) {
            existsInNums2.add(num);
        }
        for(int num : nums1) {
            if( !existsInNums2.contains(num)) {
                onlyNums1.add(num);
            }
        }
        return new ArrayList<>(onlyNums1);
}
