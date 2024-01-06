public static long reversedBitsNum(long n) {
        long decimalNumber = 0; 
        int j = 30;
        for (int i = 0; i < 32; i++) {
            int k = (int)((n >> i) & 1);
            if (k != 0) {
                if (j == -1) {
                    decimalNumber = Math.abs(decimalNumber) + (long)Math.pow(2, 0);
                } else {
                    decimalNumber = Math.abs(decimalNumber) + (2 << j);
                }
            }
            j--;
        }
        return Math.abs(decimalNumber);
}
