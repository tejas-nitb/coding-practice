public static List<Integer> getTeamGoals(int[] arr, int[] brr) {
    List<Integer> result = new ArrayList<>();  
    Arrays.sort(arr);
    int count = 0;
    int m = brr.length;
    int n = arr.length;
    for (int i = 0; i < m; i++) {
        count = 0;
        for (int j = 0; j < n; j++) {
            if (arr[j] <= brr[i])
                count++;
            else
                break;
        }
        result.add(count);
    }
    return result;
}
