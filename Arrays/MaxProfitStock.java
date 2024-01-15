public static int maxProfitStock(int[] arr) {
        int minimum = Integer.MAX_VALUE;
        int result = 0;
        for (int j : arr) {
            result = Math.max(result, j - minimum);
            minimum = Math.min(minimum, j);
        }
        return result;
}
