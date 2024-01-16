public int compress(char[] chars) {
        int i = 0;
        int result = 0;
        int length = chars.length;
        while(i < length) {
            int count = 1;
            while(i + count < length && chars[i + count] == chars[i]) {
                count++;
            }
            chars[result++] = chars[i];
            if(count > 1) {
               for(char c : Integer.toString(count).toCharArray()) {
                   chars[result++] = c;
               }
            }
            i += count;
        }
        return result;
}
