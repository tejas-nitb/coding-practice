public static int maximumProduct(ArrayList<Integer> arr, int n) {
		Integer result = arr.get(0);
		Integer maxTillNow = arr.get(0);
		Integer minTillNow = arr.get(0);

		for(int i=1; i<n;i++) {
			Integer tempMax = Math.max(Math.max(arr.get(i), arr.get(i) * maxTillNow), arr.get(i) * minTillNow);
			minTillNow = Math.min(Math.min(arr.get(i), arr.get(i) * maxTillNow), arr.get(i) * minTillNow);
			maxTillNow = tempMax;
			result = Math.max(result, maxTillNow);
		}
		return result;
	}
