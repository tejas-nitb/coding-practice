public static boolean findDuplicates(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int index = arr[i] % n;
            arr[index] += n;
        }
        for (int j : arr) {
            if (j / n >= 2) {
                return true;
            }
        }
        return false;
}
