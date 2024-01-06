public static int rob2(int[] a) {
        int n = a.length;
        if(n == 0)
            return 0;
        if(n == 1)
            return a[0];
        return Math.max(robLinear(0 , n - 2 , a) , robLinear(1 , n - 1 , a));
}

public static int robLinear(int l , int r , int[] a) {
        int inc = 0 , exc = 0 , temp;
        for(int i = l ; i <= r ; i++) {
            temp = Math.max(inc , exc);
            inc = exc + a[i];
            exc = temp;
        }
        return Math.max(inc , exc);
}
