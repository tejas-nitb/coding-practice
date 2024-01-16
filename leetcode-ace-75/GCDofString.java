public String gcdOfStrings(String str1, String str2) {
    return ((str1 + str2).equals(str2 + str1)) ? str1.substring(0, gcd(str1.length(), str2.length())) : "";
}

private int gcd(int m, int n) {
    if(n==0) {
        return m;
    } else {
        return gcd(n, Math.abs(m-n));
    }
}
