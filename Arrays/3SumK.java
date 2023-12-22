public static ArrayList<ArrayList<Integer>> findTriplets(int[] arr, int n, int K)  {
		Set<ArrayList<Integer>> returnList = new HashSet<ArrayList<Integer>>();
		Arrays.sort(arr);
    for (int i = 0; i < n-1; i++) {
        int left = i + 1;
        int right = n - 1;
        int x = arr[i];
			  while (left < right) {
          if (x + arr[left] + arr[right] == K) {
    					ArrayList<Integer> list = new ArrayList<>();
    					list.add(x);
    					list.add(arr[left]);
    					list.add(arr[right]);
    					returnList.add(list);
              left++;
              right--;
          } 
				  else if (x + arr[left] + arr[right] < K)
              left++;
          else
              right--;
        }
    }
		ArrayList<ArrayList<Integer>> myList = new ArrayList<>();
		myList.addAll(returnList);
		return myList;
}
