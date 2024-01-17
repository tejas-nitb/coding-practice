public String decodeString(String s) {
        String result = "";
        Stack<String> charStack = new Stack<>();
        Stack<Integer> intStack = new Stack<>();
        int count = 0;
        for(int i = 0; i < s.length() ; i++) {
            if(s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                count = count * 10 + s.charAt(i) - '0';
            } else if(s.charAt(i) == '[') {
                charStack.push(result);
                result = "";
                intStack.push(count);
                count = 0;
            } else if(s.charAt(i) == ']') {
                int k = intStack.pop();
                String next = charStack.pop();
                for(int j=0 ; j<k ; j++){
                    next += result;
                }
                result = next;
            } else {
                result += s.charAt(i);
            }
        }
        return result;
}
