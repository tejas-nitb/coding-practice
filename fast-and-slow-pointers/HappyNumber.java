public static boolean isHappyNumber(int n) {
        int slow = n;
        int fast = sumOfSquaredDigits(n);
        while(fast != 1 && fast != slow) {
            slow = sumOfSquaredDigits(slow);
            fast = sumOfSquaredDigits(sumOfSquaredDigits(fast));
        }
        if(fast == 1) {
            return true;
        }
        return false;
}

private static int sumOfSquaredDigits(int d) {
        int temp = d;
        int sum = 0;
        while (temp != 0) {
            int unit = temp % 10;
            sum += (Math.pow(unit, 2));
            temp = temp / 10;
        }
        return sum;
}
