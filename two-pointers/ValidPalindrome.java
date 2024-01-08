public static boolean isPalindrome(String s) {
        if(s.length() == 1) {
            return true;
        }
        int left = 0;
        int right = s.length() - 1;
        int mid = right - (right - left)/2;
        while (left < right) {
            if(s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        if(left == mid || right == mid) {
            return true;
        }
        return false;
}
