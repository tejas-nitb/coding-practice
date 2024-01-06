public static int numDecodings(String s) {
       int n = s.length();
       int[] count = new int[n + 1];
       count[0] = 1;
       count[1] = s.charAt(0) != '0' ? 1 : 0;

       for (int i = 2; i <= n; i++) {
           count[i] = 0;
           if (s.charAt(i - 1) != '0') {
               count[i] += count[i - 1];
           }
           if (s.charAt(i - 2) == '1' || (s.charAt(i - 2) == '2' && s.charAt(i - 1) <= '6')) {
               count[i] += count[i - 2];
           }
       }

       return count[n];
}
