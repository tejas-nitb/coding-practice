public static String stringConcatenation(String num1, String num2) {
		StringBuilder sb = new StringBuilder();
		int carry = 0;
		int i = num1.length() - 1, j = num2.length() - 1;
		for (;i >= 0 || j >= 0;i--,j--) {
            int x = 0, y = 0;
            if (i >= 0) {
                x = num1.charAt(i) - '0';
            }
            if (j >= 0) {
                y = num2.charAt(j) - '0'; 
            }
            int sum = x + y + carry;
            carry = sum / 10;
            sb.append(sum % 10);
        }
		if (carry != 0) {
            sb.append(carry);
        }
		return sb.reverse().toString();
	}
