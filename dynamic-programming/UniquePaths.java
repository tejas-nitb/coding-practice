public static int numberOfPaths(int m, int n) {
  // number of ways will be (m+n-2) C (n-1)
        int numberOfPaths = 1;
        for (int i = n; i < (m + n - 1); i++) {
            numberOfPaths *= i;
            numberOfPaths /= (i - n + 1);
        }
        return numberOfPaths;
}
